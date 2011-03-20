package com.rokon.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.rokon.domain.Login;

public class Auth {

	private static final Logger log = Logger.getLogger(Auth.class);

	public static void login(Login login, HttpServletRequest request) {
		if (login == null) {
			throw new RuntimeException("Null login");
		}

		HttpSession session = request.getSession();
		// Hibernate.initialize(login);
		session.setAttribute(SessionKeys.AUTH, login);
		request.setAttribute(RequestKeys.AUTH_ATTRIBUE, login);
	}

	public static void logout(Login login, HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session != null) {
			session.invalidate();
		}
	}

	/**
	 * Retrieve the logged in user from HTTP session.
	 */
	public static Login getLogin(HttpServletRequest request) {
		Login login = getLoginNullable(request);

		if (login == null) {
			log.error("No login object found in session");
			throw new RuntimeException("No login object found in session");
		}

		return login;
	}

	public static Login getLoginNullable(HttpServletRequest request) {
		return (Login) request.getAttribute(RequestKeys.AUTH_ATTRIBUE);
	}

	/**
	 * Check if there is a logged in user.
	 */
	public static boolean isLoggedIn(HttpServletRequest request) {
		Login login = getLoginNullable(request);
		return (login != null);
	}

}
