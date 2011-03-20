package com.rokon.service;

import com.rokon.dao.ParticularsOfExpenditureDao;
import com.rokon.domain.ParticularsOfExpenditure;

public class ParticularsOfExpenditureServiceImpl implements
		ParticularsOfExpenditureService {
	ParticularsOfExpenditureDao particularsOfExpenditureDao;

	public void setParticularsOfExpenditureDao(
			ParticularsOfExpenditureDao particularsOfExpenditureDao) {
		this.particularsOfExpenditureDao = particularsOfExpenditureDao;
	}

	@Override
	public void add(ParticularsOfExpenditure particularsOfExpenditure) {
		System.out.println("Particular of Expenditure added successfully");
	}

	public double calculateValue(int id) {
		double total;
		double taxable;

		ParticularsOfExpenditure particularsOfExpenditure = particularsOfExpenditureDao
				.getParticularsOfExpenditure(id);
		double temp = 0;
		if (particularsOfExpenditure != null) {
			try {

				temp += Double.parseDouble(particularsOfExpenditure
						.getAccommodationExpense());

				temp += Double.parseDouble(particularsOfExpenditure
						.getEducationExpense());

				temp += Double.parseDouble(particularsOfExpenditure
						.getElectricityBill());
				temp += Double.parseDouble(particularsOfExpenditure
						.getFestivalExpense());
				temp += Double.parseDouble(particularsOfExpenditure
						.getForeignTravelExpense());
				temp += Double.parseDouble(particularsOfExpenditure
						.getGasBill());
				temp += Double.parseDouble(particularsOfExpenditure
						.getPersonalFoodExpense());
				temp += Double.parseDouble(particularsOfExpenditure
						.getTaxPaidLastYear());
				temp += Double.parseDouble(particularsOfExpenditure
						.getTelephoneBill());
				temp += Double.parseDouble(particularsOfExpenditure
						.getTransportExpense());
				temp += Double.parseDouble(particularsOfExpenditure
						.getWasaBill());

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		total = temp;

		return total;
	}
}
