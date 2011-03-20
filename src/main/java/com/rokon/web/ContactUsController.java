package com.rokon.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.rokon.domain.ContactUs;

@SuppressWarnings("deprecation")
public class ContactUsController extends SimpleFormController {
	private static final Logger log = Logger
			.getLogger(ContactUsController.class);

	public ContactUsController() {
		setCommandClass(ContactUs.class);
		setCommandName("contactUs");
	}

	protected ModelAndView onSubmit(Object command) throws Exception {

		ContactUs contact = (ContactUs) command;
		ModelAndView mv = new ModelAndView("contact_success");

		return mv;
		// TODO Auto-generated method stub
		// return super.onSubmit(request, response, command, errors);
	}

}
