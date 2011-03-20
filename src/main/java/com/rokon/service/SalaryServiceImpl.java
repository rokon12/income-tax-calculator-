package com.rokon.service;

import com.rokon.dao.SalaryDao;
import com.rokon.domain.Salary;
import com.rokon.domain.CalUtils;

public class SalaryServiceImpl implements SalaryService {

	SalaryDao salaryDao;

	public void setSalaryDao(SalaryDao salaryDao) {
		this.salaryDao = salaryDao;
	}

	@Override
	public void add(Salary salary) {
		if (salary != null) {
			salaryDao.saveSalary(salary);
			System.out.println("Salary added successfully");
		}
	}

	public CalUtils calculateValue(int id) {

		CalUtils cal = new CalUtils();
		Salary salary = salaryDao.getSalary(id);
		double totalSalary = 0;
		double taxableSalary = 0;

		if (salary != null) {
			try {

				// --------basic pay calculation ------------
				double temp = parseDoubleOrZero(salary.getBasicpay());
				double basic = temp * 12; // aita onno jaigai kaje lagbe
				totalSalary += (temp * 12);
				taxableSalary += temp;

				// --------- special pay calculation----------------
				temp = parseDoubleOrZero(salary.getSpecialpay());
				totalSalary += temp * 12;
				taxableSalary += temp;

				// --------- dearness allowance calculation-----------
				temp = parseDoubleOrZero(salary.getDearall());
				totalSalary += temp * 12;
				taxableSalary += temp;

				// ----------------------------------------------
				// House rent calculation
				temp = parseDoubleOrZero(salary.getHouserent());
				temp *= 12;
				totalSalary += temp;

				double temp1 = basic / 2;
				double temp2 = 0;
				if (temp > 180000) {
					temp2 = temp - 180000;
				}

				if (temp1 > temp2) {
					taxableSalary += temp2;
				} else
					taxableSalary += temp1;

				// --------------conveyance allowance calculation-------------
				temp = parseDoubleOrZero(salary.getConvyall());
				totalSalary += temp * 12;
				if (temp > 24000) {
					taxableSalary += temp - 24000;
				}

				// ------------Entertainment allowance calculation-----------
				temp = parseDoubleOrZero(salary.getEntertainment());
				totalSalary += temp;
				taxableSalary += temp;

				// ------------Medical Allowance calculation ---------
				temp = parseDoubleOrZero(salary.getMedicall());
				totalSalary += temp;
				double expMedi = parseDoubleOrZero(salary.getExpendmed());
				taxableSalary += (temp - expMedi);

				// ----------Servant allowance calculation ---------
				temp = parseDoubleOrZero(salary.getServantall());
				totalSalary += temp * 12;
				taxableSalary += temp;

				// ----- leave allowance calculation--------
				temp = parseDoubleOrZero(salary.getLeaveall());
				totalSalary += temp;
				taxableSalary += temp;

				// ------ Honorarium calculation ------------
				temp = parseDoubleOrZero(salary.getHonorarium());
				totalSalary += temp;
				taxableSalary += temp;

				// ----------Over time calculation --------
				temp = parseDoubleOrZero(salary.getOvertime());
				totalSalary += temp;
				taxableSalary += temp;

				// Other allowance (Entertainment)--------
				temp = parseDoubleOrZero(salary.getOthers());
				totalSalary += temp;
				taxableSalary += temp;

				// --------- Bonus calculation----------
				temp = parseDoubleOrZero(salary.getBonus());
				totalSalary += temp;
				taxableSalary += temp;

				// ------------employee contribution---------
				temp = parseDoubleOrZero(salary.getProvidentcontri());
				totalSalary += temp;
				taxableSalary += temp;

				// ---------- provident fund---------
				temp = parseDoubleOrZero(salary.getProvidentaccrued());
				totalSalary += temp;

				// Deemed income for transport facility
				// aita akhono buji nai.. pran ar help lagbe...
				temp = parseDoubleOrZero(salary.getTransfacility());
				totalSalary += temp;
				taxableSalary += temp;

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		cal.setTaxableIncome(taxableSalary);
		cal.setTotalIncome(totalSalary);

		return cal;
	}
	
	private double parseDoubleOrZero(String value) {
		if (value == null || value.trim().isEmpty()) {
			return 0.0;
		}
		try {
			return Double.parseDouble(value.trim());
		} catch (NumberFormatException e) {
			return 0.0;
		}
	}
}
