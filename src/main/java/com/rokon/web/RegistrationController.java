package com.rokon.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.CancellableFormController;

import com.rokon.domain.Login;
import com.rokon.service.RegisterService;

@SuppressWarnings("deprecation")
public class RegistrationController extends CancellableFormController {

	public RegistrationController() {
		setCommandClass(Login.class);
		setCommandName("register");
	}

	RegisterService registerService;

	public void setRegisterService(RegisterService registerService) {
		this.registerService = registerService;
	}

	@Override
	protected ModelAndView onSubmit(Object command) throws Exception {
		Login register = (Login) command;
		registerService.register(register);

		return new ModelAndView("registrationSuccess");
	}
}
