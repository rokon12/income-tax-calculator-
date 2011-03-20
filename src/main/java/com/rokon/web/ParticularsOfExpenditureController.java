package com.rokon.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.CancellableFormController;

import com.rokon.domain.ParticularsOfExpenditure;
import com.rokon.service.ParticularsOfExpenditureService;

@SuppressWarnings("deprecation")
public class ParticularsOfExpenditureController extends
		CancellableFormController {

	private ParticularsOfExpenditureService getParticularsOfExpenditure;

	public void setGetParticularsOfExpenditure(
			ParticularsOfExpenditureService getParticularsOfExpenditure) {
		this.getParticularsOfExpenditure = getParticularsOfExpenditure;
	}

	public ParticularsOfExpenditureController() {
		setCommandClass(ParticularsOfExpenditure.class);
		setCommandName("particularsOfExpenditure");
	}

	@Override
	protected ModelAndView onSubmit(Object command) throws Exception {

		ParticularsOfExpenditure particularsOfExpenditure = (ParticularsOfExpenditure) command;
		getParticularsOfExpenditure.add(particularsOfExpenditure);

		return new ModelAndView("redirect:/report.htm");
	}

}
