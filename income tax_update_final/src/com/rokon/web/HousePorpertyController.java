package com.rokon.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.CancellableFormController;

import com.rokon.domain.HouseProperty;
import com.rokon.service.HousePropertyService;

@SuppressWarnings("deprecation")
public class HousePorpertyController extends CancellableFormController {
	HousePropertyService getHouseProperty;

	public void setGetHouseProperty(HousePropertyService getHouseProperty) {
		this.getHouseProperty = getHouseProperty;
	}

	public HousePorpertyController() {
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
