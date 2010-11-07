package com.rokon.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.rokon.domain.Login;
import com.rokon.service.LoginService;

@SuppressWarnings("deprecation")
public class LoginController extends SimpleFormController {

	private static final Logger log = Logger.getLogger(LoginController.class);

	private LoginService loginService;

	/*
	 * protected void initBinder(HttpServletRequest request,
	 * ServletRequestDataBinder binder) throws Exception {
	 * super.initBinder(request, binder); binder.setRequiredFields(new
	 * String[]{"userName", "password"}); }
	 */

	protected ModelAndView showForm(HttpServletRequest request,
			HttpServletResponse response, BindException e) throws Exception {
		if (ServletRequestUtils.getStringParameter(request, "action", "")
				.equals("logout")) {
			Auth.logout((Login) e.getTarget(), request);
			return new ModelAndView("redirect:/loginPage.htm");
		}

		if (Auth.isLoggedIn(request)) {
			return new ModelAndView(getSuccessView());
		}

		ModelAndView mv = super.showForm(request, response, e);
		if (ServletRequestUtils.getBooleanParameter(request, "sessionError",
				false) == true) {
			mv.getModel().put("erroMsg", "Login is must");
		}
		return mv;
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		ModelAndView mv;
		Login login = (Login) command;

		try {
			Login dbLogin = loginService.getLogin(login.getUsername(), login
					.getPassword());
			if (dbLogin == null) {
				/*throw new RuntimeException(
						"Login name and password are case sensitive");*/
				//log.debug("INCORRECT LOGIN NAME / PASSWORD:", e);
				errors.rejectValue("password", "pass.incorrect",
						"Incorrect Login Name / Password");
				mv = this.showForm(request, response, errors);
			}

			Auth.login(dbLogin, request);
			mv = super.onSubmit(request, response, command, errors);
		} catch (Exception e) {
			//log.debug("Error logging in ", e);
			errors.rejectValue("password", "pass.incorrect",
					"Incorrect Login Name / Password");
			mv = this.showForm(request, response, errors);
		}
		return mv;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
}
