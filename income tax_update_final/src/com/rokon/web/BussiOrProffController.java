package com.rokon.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.rokon.domain.BussiOrProff;
import com.rokon.service.BussiOrProffService;

@SuppressWarnings("deprecation")
public class BussiOrProffController extends SimpleFormController {
	BussiOrProffService bussiOrProffService;

	public void setBussiOrProffService(BussiOrProffService bussiOrProffService) {
		this.bussiOrProffService = bussiOrProffService;
	}

	public BussiOrProffController() {
		setCommandClass(BussiOrProff.class);
		setCommandName("bussiOrProff");
	}

	/*
	 * public ModelAndView onSumbit(Object command) throws Exception {
	 * BussiOrProff bussiOrProff = (BussiOrProff) command;
	 * bussiOrProffService.add(bussiOrProff);
	 * 
	 * return new ModelAndView(""); }
	 */

	public ModelAndView onSubmit(Object command) {
		// Salary salary = (Salary) command;
		// getSalary.add(salary);
		// return new ModelAndView("redirect:/houseProperty.htm");

		// Security security = (Security) command;
		// securityService.add(security);
		BussiOrProff bussiOrProff = (BussiOrProff) command;
		bussiOrProffService.add(bussiOrProff);
		return new ModelAndView("redirect:/investmentCredit.htm");
	}

}
