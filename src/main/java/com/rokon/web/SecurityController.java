package com.rokon.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.CancellableFormController;

import com.rokon.domain.Security;
import com.rokon.service.SecurityService;

@SuppressWarnings("deprecation")
public class SecurityController extends CancellableFormController {
	SecurityService securityService;

	public void setSecurityService(SecurityService securityService) {
		this.securityService = securityService;
	}

	public SecurityController() {
		setCommandClass(Security.class);
		setCommandName("security");
	}

	public ModelAndView onSubmit(Object command) {
		// Salary salary = (Salary) command;
		// getSalary.add(salary);
		// return new ModelAndView("redirect:/houseProperty.htm");

		Security security = (Security) command;
		securityService.add(security);
		return new ModelAndView("redirect:/captalgain.htm");
	}

}
