package com.rokon.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.rokon.domain.InvestmentTaxCredit;
import com.rokon.service.InvestmentTaxCreditService;

@SuppressWarnings("deprecation")
public class InvestmentTaxCreditController extends SimpleFormController {
	public InvestmentTaxCreditController() {
		setCommandClass(InvestmentTaxCredit.class);
		setCommandName("investmentTaxCredit");
	}

	InvestmentTaxCreditService getInvestmentTaxCredit;

	public void setGetInvestmentTaxCredit(
			InvestmentTaxCreditService getInvestmentTaxCredit) {
		this.getInvestmentTaxCredit = getInvestmentTaxCredit;
	}

	@Override
	protected ModelAndView onSubmit(Object command) throws Exception {

		InvestmentTaxCredit investmentTaxCredit = (InvestmentTaxCredit) command;
		getInvestmentTaxCredit.add(investmentTaxCredit);

		return new ModelAndView("redirect:/statmentOfAssetForm.htm");
	}
}
