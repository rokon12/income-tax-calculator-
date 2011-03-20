package com.rokon.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.CancellableFormController;

import com.rokon.domain.StatementOfAssets;
import com.rokon.service.StatementOfAssetsService;

@SuppressWarnings("deprecation")
public class StatementOfAssetsController extends CancellableFormController {

	private StatementOfAssetsService getStatementOfAssets;

	public void setGetStatementOfAssets(
			StatementOfAssetsService getStatementOfAssets) {
		this.getStatementOfAssets = getStatementOfAssets;
	}

	public StatementOfAssetsController() {
		setCommandClass(StatementOfAssets.class);
		setCommandName("statementOfAssets");
	}

	@Override
	protected ModelAndView onSubmit(Object command) throws Exception {

		StatementOfAssets statementOfAssets = (StatementOfAssets) command;
		getStatementOfAssets.add(statementOfAssets);
		return new ModelAndView("redirect:/particularExpForm.htm");
	}

}
