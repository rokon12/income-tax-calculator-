package com.rokon.service;

import com.rokon.dao.AgricultureIncomeDao;
import com.rokon.domain.AgricultureIncome;
import com.rokon.domain.CalUtils;

public class AgricultureIncomeServiceImpl implements AgricultureIncomeService {

	@Override
	public void add(AgricultureIncome agricultureIncome) {
		System.out.println("Agriculture Income added.");
	}

	AgricultureIncomeDao agricultureIncomeDao;

	public void setAgricultureIncomeDao(AgricultureIncomeDao agricultureIncomeDao) {
		this.agricultureIncomeDao = agricultureIncomeDao;
	}

	public CalUtils calculateValue(int id) {

		CalUtils cal = new CalUtils();

		double totalIncome = 0;
		double taxableIncome = 0;

		AgricultureIncome agricultureIncome = agricultureIncomeDao
				.getAgricultureIncome(id);

		if (agricultureIncome != null) {
			try {
				double land = Double.parseDouble(agricultureIncome
						.getTotalAmountOfLand());
				double unit = Double.parseDouble(agricultureIncome
						.getProductionPerUnit());
				double marker_prize = Double.parseDouble(agricultureIncome
						.getMarketPricePerCrops());

				totalIncome = land * unit * marker_prize;

				double production_cost = Double.parseDouble(agricultureIncome
						.getProductionCost());
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
