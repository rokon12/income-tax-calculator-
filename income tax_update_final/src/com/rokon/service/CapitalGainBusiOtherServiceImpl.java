package com.rokon.service;

import com.rokon.dao.CapitalGainBusiOtherDao;
import com.rokon.domain.CapitalGainBusiOther;
import com.rokon.domain.calUtils;

public class CapitalGainBusiOtherServiceImpl implements
		CapitalGainBusiOtherService {
	CapitalGainBusiOtherDao capitalGainBusiOtherDao;
	
	public void setCapitalGainBusiOtherDao(
			CapitalGainBusiOtherDao capitalGainBusiOtherDao) {
		this.capitalGainBusiOtherDao = capitalGainBusiOtherDao;
	}

	public calUtils calculateValue(int id) {

		return null;
	}

	@Override
	public void add(CapitalGainBusiOther capitalGainBusiOther) {
		System.out.println("CapitalGainBusiOther added");

	}
}
