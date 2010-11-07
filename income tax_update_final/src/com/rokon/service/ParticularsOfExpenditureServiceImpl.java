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
						.getAcc_exp());

				temp += Double.parseDouble(particularsOfExpenditure
						.getEducation_exp());

				temp += Double.parseDouble(particularsOfExpenditure
						.getElectricity_bill());
				temp += Double.parseDouble(particularsOfExpenditure
						.getFestival_exp());
				temp += Double.parseDouble(particularsOfExpenditure
						.getFor_travel_exp());
				temp += Double.parseDouble(particularsOfExpenditure
						.getGas_bill());
				temp += Double.parseDouble(particularsOfExpenditure
						.getPer_food_expense());
				temp += Double.parseDouble(particularsOfExpenditure
						.getTax_paid_last_year());
				temp += Double.parseDouble(particularsOfExpenditure
						.getTelephone_bill());
				temp += Double.parseDouble(particularsOfExpenditure
						.getTrans_exp());
				temp += Double.parseDouble(particularsOfExpenditure
						.getWasa_bill());

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		total = temp;

		return total;
	}
}
