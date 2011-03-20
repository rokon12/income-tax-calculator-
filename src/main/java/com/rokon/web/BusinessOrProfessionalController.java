package com.rokon.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.rokon.domain.BusinessOrProfessional;
import com.rokon.service.BusinessOrProfessionalService;

@SuppressWarnings("deprecation")
public class BusinessOrProfessionalController extends SimpleFormController {
	BusinessOrProfessionalService businessOrProfessionalService;

	public void setBusinessOrProfessionalService(BusinessOrProfessionalService businessOrProfessionalService) {
		this.businessOrProfessionalService = businessOrProfessionalService;
	}

	public BusinessOrProfessionalController() {
		setCommandClass(BusinessOrProfessional.class);
		setCommandName("businessOrProfessional");
	}

	public ModelAndView onSubmit(Object command) {
		BusinessOrProfessional businessOrProfessional = (BusinessOrProfessional) command;
		businessOrProfessionalService.add(businessOrProfessional);
		return new ModelAndView("redirect:/investmentCredit.htm");
	}

}
