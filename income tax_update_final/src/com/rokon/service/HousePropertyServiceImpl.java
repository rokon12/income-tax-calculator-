package com.rokon.service;

import com.rokon.dao.HousePropertyDao;
import com.rokon.domain.HouseProperty;
import com.rokon.domain.calUtils;

public class HousePropertyServiceImpl implements HousePropertyService {

	HousePropertyDao housePropertyDao;

	public void setHousePropertyDao(HousePropertyDao housePropertyDao) {
		this.housePropertyDao = housePropertyDao;
	}

	@Override
	public void add(HouseProperty houseProperty) {
		System.out.println("House Property added successfully");
	}

	public calUtils calculatValue(int id) {
		calUtils cal = new calUtils();
		HouseProperty houseProperty = housePropertyDao.getHouseProperty(id);

		double total = 0;
		double taxable = 0, cost = 0;

		if (houseProperty != null) {
			try {
				total = Double.parseDouble(houseProperty.getRentalincome());
				cost += Double.parseDouble(houseProperty.getInsu_prem());
				cost += Double.parseDouble(houseProperty
						.getInt_loan_or_mortgaze());
				cost += Double.parseDouble(houseProperty.getLendrev());
				cost += Double.parseDouble(houseProperty.getMunicipal());
				cost += Double.parseDouble(houseProperty.getOther());
				cost += Double.parseDouble(houseProperty.getRepair());
				cost += Double.parseDouble(houseProperty.getVacan_all());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		taxable = total - cost;

		cal.setTaxableIncome(taxable);
		cal.setTotalIncome(total);

		return cal;
	}
}
