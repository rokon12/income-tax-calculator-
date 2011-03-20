package com.rokon.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.CancellableFormController;

import com.rokon.domain.HouseProperty;
import com.rokon.service.HousePropertyService;

@SuppressWarnings("deprecation")
public class HousePropertyController extends CancellableFormController {
	HousePropertyService getHouseProperty;

	public void setGetHouseProperty(HousePropertyService getHouseProperty) {
		this.getHouseProperty = getHouseProperty;
	}

	public HousePropertyController() {
		setCommandClass(HouseProperty.class);
		setCommandName("houseProperty");

	}

	@Override
	protected ModelAndView onSubmit(Object command) throws Exception {
		HouseProperty houseProperty = (HouseProperty) command;
		getHouseProperty.add(houseProperty);
		return new ModelAndView("redirect:/agriculture.htm");
	}
}
