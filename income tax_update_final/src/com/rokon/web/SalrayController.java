package com.rokon.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.CancellableFormController;

import com.rokon.domain.Salary;
import com.rokon.service.SalaryService;

@SuppressWarnings("deprecation")
public class SalrayController extends CancellableFormController {

	private SalaryService getSalary;

	@SuppressWarnings("deprecation")
	public SalrayController() {
		setCommandClass(Salary.class);
		setCommandName("salary");
	}

	@Override
	protected ModelAndView onSubmit(Object command) throws Exception {
		Salary salary = (Salary) command;
		getSalary.add(salary);
		return new ModelAndView("redirect:/houseProperty.htm");
	}

	public void setGetSalary(SalaryService getSalary) {
		this.getSalary = getSalary;
	}
}
