package com.rokon.service;

import com.rokon.dao.SalaryDao;
import com.rokon.domain.Salary;
import com.rokon.domain.calUtils;

public class SalaryServiceImpl implements SalaryService {

	SalaryDao salaryDao;

	public void setSalaryDao(SalaryDao salaryDao) {
		this.salaryDao = salaryDao;
	}

	@Override
	public void add(Salary salary) {
		System.out.println("Salary added successfully");
	}

	public calUtils calculateValue(int id) {

		calUtils cal = new calUtils();
		Salary salary = salaryDao.getSalary(id);
		double totalSalary = 0;
		double taxableSalary = 0;

		if (salary != null) {
			try {

				// --------basic pay calculation ------------
				double temp = Double.parseDouble(salary.getBasicpay());
				double basic = temp * 12; // aita onno jaigai kaje lagbe
				totalSalary += (temp * 12);
				taxableSalary += temp;

				// --------- special pay calculation----------------
				temp = Double.parseDouble(salary.getSpacialpay());
				totalSalary += temp * 12;
				taxableSalary += temp;

				// --------- dearness allowance calculation-----------
				temp = Double.parseDouble(salary.getDearall());
				totalSalary += temp * 12;
				taxableSalary += temp;

				// ----------------------------------------------
				// House rent calculation
				temp = Double.parseDouble(salary.getHouserent());
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
				temp = Double.parseDouble(salary.getConvyall());
				totalSalary += temp * 12;
				if (temp > 24000) {
					taxableSalary = temp - 24000;
				}

				// ------------Entertainment allowance calculation-----------
				temp = Double.parseDouble(salary.getEntertainment());
				totalSalary += temp;
				taxableSalary += temp;

				// ------------Medical Allownance calculation ---------
				temp = Double.parseDouble(salary.getMediall());
				totalSalary += temp;
				double expMedi = Double.parseDouble(salary.getExpendmed());
				taxableSalary += (temp - expMedi);

				// ----------Servent allownace calculation ---------
				temp = Double.parseDouble(salary.getSerall());
				totalSalary += temp * 12;
				taxableSalary += temp;

				// ----- leave allownce calculation--------
				temp = Double.parseDouble(salary.getLeaveall());
				totalSalary += temp;
				taxableSalary += temp;

				// ------ Hounariam calculation ------------
				temp = Double.parseDouble(salary.getHonorium());
				totalSalary += temp;
				taxableSalary += temp;

				// ----------Over time calculation --------
				temp = Double.parseDouble(salary.getOvertime());
				totalSalary += temp;
				taxableSalary += temp;

				// Other allowance (Entertainment)--------
				temp = Double.parseDouble(salary.getOthers());
				totalSalary += temp;
				taxableSalary += temp;

				// --------- Bonus calculation----------
				temp = Double.parseDouble(salary.getBonus());
				totalSalary += temp;
				taxableSalary += temp;

				// ------------employee contribution---------
				temp = Double.parseDouble(salary.getProvidentcontri());
				totalSalary += temp;
				taxableSalary += temp;

				// ---------- provident fund---------
				temp = Double.parseDouble(salary.getPrvidentaccrud());
				totalSalary += temp;

				// Deemed income for transport facility
				// aita akhono buji nai.. pran ar help lagbe...
				temp = Double.parseDouble(salary.getTrancfacility());

				// ohter if any
				temp = Double.parseDouble(salary.getOthers());
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
}
