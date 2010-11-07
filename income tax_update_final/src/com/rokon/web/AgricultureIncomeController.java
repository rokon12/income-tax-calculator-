package com.rokon.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.CancellableFormController;

import com.rokon.domain.AgricultureIncome;
import com.rokon.service.AgricultureIncomeService;

@SuppressWarnings("deprecation")
public class AgricultureIncomeController extends CancellableFormController {

	AgricultureIncomeService agricultureIncomeService;

	public void setAgricultureIncomeService(
			AgricultureIncomeService agricultureIncomeService) {
		this.agricultureIncomeService = agricultureIncomeService;
	}

	public AgricultureIncomeController() {
		setCommandClass(AgricultureIncome.class);
		setCommandName("agricultureIncome");
	}

	public ModelAndView onSubmit(Object command) {
		AgricultureIncome agricultureIncome = (AgricultureIncome) command;
		agricultureIncomeService.add(agricultureIncome);
		return new ModelAndView("redirect:/security.htm");
	}
}
