package com.rokon.service;

import com.rokon.dao.AgricultureIncomeDao;
import com.rokon.domain.AgricultureIncome;
import com.rokon.domain.calUtils;

public class AgricultureIncomeServiceImpl implements AgricultureIncomeService {

	@Override
	public void add(AgricultureIncome agricultureIncome) {
		System.out.println("Agriculture Income added.");
	}

	AgricultureIncomeDao agricultureIncomeDao;

	public void setAgricultureIncomeDao(AgricultureIncomeDao agricultureIncomeDao) {
		this.agricultureIncomeDao = agricultureIncomeDao;
	}

	public calUtils calculateValue(int id) {

		calUtils cal = new calUtils();

		double totalIncome = 0;
		double taxableIncome = 0;

		AgricultureIncome agricultureIncome = agricultureIncomeDao
				.getAgricultureIncome(id);

		if (agricultureIncome != null) {
			try {
				double land = Double.parseDouble(agricultureIncome
						.getTotal_amount_of_land());
				double unit = Double.parseDouble(agricultureIncome
						.getProduction_per_unit());
				double marker_prize = Double.parseDouble(agricultureIncome
						.getMarket_prize_per_crops());

				totalIncome = land * unit * marker_prize;

				double production_cost = Double.parseDouble(agricultureIncome
						.getProduction_cost());
				taxableIncome = totalIncome - (production_cost * 0.6);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		cal.setTaxableIncome(taxableIncome);
		cal.setTotalIncome(totalIncome);

		return cal;
	}
}
