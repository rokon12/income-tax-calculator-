package com.rokon.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.rokon.domain.Login;

public class AuthFilter implements Filter {

	private static final Logger log = Logger.getLogger(AuthFilter.class);

	public static final String ENCODING = "UTF-8";

	public void init(FilterConfig config) {
		/* do nothing */
	}

	public void destroy() {
		/* do nothing */
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest hsreq = (HttpServletRequest) request;
		HttpServletResponse hsres = (HttpServletResponse) response;
		final String uri = hsreq.getRequestURI().substring(
				hsreq.getContextPath().length());

		if (hsreq.getCharacterEncoding() == null) {
			hsreq.setCharacterEncoding(ENCODING);
		}
		if (hsreq.getRequestURI().contains("loginPage")
				|| hsreq.getRequestURI().contains("userResitration")
				|| hsreq.getRequestURI().contains("adminHome")
				|| hsreq.getRequestURI().contains("green11")
				|| hsreq.getRequestURI().contains("home")
				|| hsreq.getRequestURI().contains("help")
				|| hsreq.getRequestURI().contains("about")
				|| hsreq.getRequestURI().contains("contact_us")
				|| hsreq.getRequestURI().contains("itaxBan")
				|| hsreq.getRequestURI().contains("rehenu")
				|| hsreq.getRequestURI().contains("rasedul_bari")
				|| hsreq.getRequestURI().contains("pran")
				|| hsreq.getRequestURI().contains("rokon")) {
			chain.doFilter(request, response);
			return;
		}

		Login login = null;
		HttpSession session = hsreq.getSession(false); // session will null if
		// it is aleady expired
		if (session != null) {
			log.debug("session : " + session.getId());
			login = (Login) session.getAttribute(SessionKeys.AUTH);
			if (login == null) {
				session.invalidate();
				session = null;
			}
		}

		if (session == null) {
			log.debug("Caught session expired case: URI=[" + uri + "], IP="
					+ hsreq.getRemoteAddr());
			if (!uri.equals(Forwards.AUTH_VIEW_PATH)) {
				hsres.sendRedirect(hsreq.getContextPath()
						+ Forwards.AUTH_VIEW_PATH + "?sessionError=true");
				return;
			}
		}

		chain.doFilter(request, response);
		return;
	}
}
