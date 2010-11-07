package com.rokon.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.CancellableFormController;

import com.rokon.domain.CapitalGainBusiOther;
import com.rokon.service.CapitalGainBusiOtherService;

@SuppressWarnings("deprecation")
public class CapitalGainBusiOtherController extends CancellableFormController {
	CapitalGainBusiOtherService capitalGainBusiOtherService;

	public void setCapitalGainBusiOtherService(
			CapitalGainBusiOtherService capitalGainBusiOtherService) {
		this.capitalGainBusiOtherService = capitalGainBusiOtherService;
	}

	public CapitalGainBusiOtherController() {
		setCommandClass(CapitalGainBusiOther.class);
		setCommandName("capitalGainBusiOther");
	}

	public ModelAndView onSubmit(Object command) throws Exception {
		CapitalGainBusiOther capitalGainBusiOther = (CapitalGainBusiOther) command;
		capitalGainBusiOtherService.add(capitalGainBusiOther);
		return new ModelAndView("redirect:/bussiOrProff.htm");
	}
}
