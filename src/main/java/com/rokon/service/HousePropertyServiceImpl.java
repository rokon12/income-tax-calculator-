package com.rokon.service;

import com.rokon.dao.HousePropertyDao;
import com.rokon.domain.HouseProperty;
import com.rokon.domain.CalUtils;

public class HousePropertyServiceImpl implements HousePropertyService {

	HousePropertyDao housePropertyDao;

	public void setHousePropertyDao(HousePropertyDao housePropertyDao) {
		this.housePropertyDao = housePropertyDao;
	}

	@Override
	public void add(HouseProperty houseProperty) {
		System.out.println("House Property added successfully");
	}

	public CalUtils calculatValue(int id) {
		CalUtils cal = new CalUtils();
		HouseProperty houseProperty = housePropertyDao.getHouseProperty(id);

		double total = 0;
		double taxable = 0, cost = 0;

		if (houseProperty != null) {
			try {
				total = Double.parseDouble(houseProperty.getRentalIncome());
				cost += Double.parseDouble(houseProperty.getInsurancePremium());
				cost += Double.parseDouble(houseProperty
						.getInterestLoanOrMortgage());
				cost += Double.parseDouble(houseProperty.getLandRevenue());
				cost += Double.parseDouble(houseProperty.getMunicipal());
				cost += Double.parseDouble(houseProperty.getOther());
				cost += Double.parseDouble(houseProperty.getRepair());
				cost += Double.parseDouble(houseProperty.getVacancyAllowance());
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
