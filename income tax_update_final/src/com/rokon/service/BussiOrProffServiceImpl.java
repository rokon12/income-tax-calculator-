package com.rokon.service;

import com.rokon.dao.BussiOrProffDao;
import com.rokon.domain.BussiOrProff;
import com.rokon.domain.calUtils;

public class BussiOrProffServiceImpl implements BussiOrProffService {

	BussiOrProffDao bussiOrProffDao;

	public void setBussiOrProffDao(BussiOrProffDao bussiOrProffDao) {
		this.bussiOrProffDao = bussiOrProffDao;
	}

	@Override
	public void add(BussiOrProff bussiOrProff) {
		System.out.println("BussiOrProffService added.");
	}

	@Override
	public calUtils calculateValue(int id) {

		return null;
	}

}
