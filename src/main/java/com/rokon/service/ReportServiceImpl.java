package com.rokon.service;

import com.rokon.dao.AgricultureIncomeDao;
import com.rokon.dao.BusinessOrProfessionalDao;
import com.rokon.dao.CapitalGainBusiOtherDao;
import com.rokon.dao.HousePropertyDao;
import com.rokon.dao.InvestmentTaxCreditDao;
import com.rokon.dao.LoginDao;
import com.rokon.dao.ParticularsOfExpenditureDao;
import com.rokon.dao.RegisterDao;
import com.rokon.dao.SalaryDao;
import com.rokon.dao.SecurityDao;
import com.rokon.dao.StatementOfAssetsDao;

import com.rokon.dao.UserDao;
import com.rokon.domain.Login;
import com.rokon.domain.Report;
import com.rokon.domain.User;
import com.rokon.domain.CalUtils;

public class ReportServiceImpl implements ReportService {

	@Override
	public CalUtils calculateValue(int id) {
		return null;
	}

	LoginDao loginDao;

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void setAgricultureIncomeDao(
			AgricultureIncomeDao agricultureIncomeDao) {
		this.agricultureIncomeDao = agricultureIncomeDao;
	}

	public void setBusinessOrProfessionalDao(BusinessOrProfessionalDao businessOrProfessionalDao) {
		this.businessOrProfessionalDao = businessOrProfessionalDao;
	}

	public void setCapitalGainBusiOtherDao(
			CapitalGainBusiOtherDao capitalGainBusiOtherDao) {
		this.capitalGainBusiOtherDao = capitalGainBusiOtherDao;
	}

	public void setHousePropertyDao(HousePropertyDao housePropertyDao) {
		this.housePropertyDao = housePropertyDao;
	}

	public void setInvestmentTaxCreditDao(
			InvestmentTaxCreditDao investmentTaxCreditDao) {
		this.investmentTaxCreditDao = investmentTaxCreditDao;
	}

	public void setParticularsOfExpenditureDao(
			ParticularsOfExpenditureDao particularsOfExpenditureDao) {
		this.particularsOfExpenditureDao = particularsOfExpenditureDao;
	}

	public void setSalaryDao(SalaryDao salaryDao) {
		this.salaryDao = salaryDao;
	}

	public void setSecurityDao(SecurityDao securityDao) {
		this.securityDao = securityDao;
	}

	public void setStatementOfAssetsDao(
			StatementOfAssetsDao statementOfAssetsDao) {
		this.statementOfAssetsDao = statementOfAssetsDao;
	}

	public void setUserInfoDao(UserDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}

	Login login;
	// RegisterDao registerDao;
	UserDao userDao;
	AgricultureIncomeDao agricultureIncomeDao;
	BusinessOrProfessionalDao businessOrProfessionalDao;
	CapitalGainBusiOtherDao capitalGainBusiOtherDao;
	HousePropertyDao housePropertyDao;
	InvestmentTaxCreditDao investmentTaxCreditDao;
	ParticularsOfExpenditureDao particularsOfExpenditureDao;
	SalaryDao salaryDao;
	SecurityDao securityDao;
	StatementOfAssetsDao statementOfAssetsDao;
	UserDao userInfoDao;

	public double totalTax(double taxableIncome, int id) {
		// loginDao = registerDao.getRegister(id);
		login = loginDao.getLogin(id);
		String gender = login.getGender();
		double texablIncom = taxableIncome;
		double income = taxableIncome;
		double tax = 0;
		if (gender.equalsIgnoreCase("Female")) {
			double temp;
			if (income >= 180000) {
				temp = income - 180000;
				if (temp >= 270000) {
					temp -= 270000;
					tax += (270000 * .1);
				} else {
					tax += (temp * .1);
					temp = 0;
				}
				if (temp > 0 && temp <= 320000) {
					tax += (temp * .15);
					temp -= 320000;
				}
				if (temp > 0 && temp <= 375000) {
					tax += (temp * .2);
					temp -= 320000;
				}
				if (temp > 0) {
					tax += (temp * .25);
				}
			}

			return tax;
		} else {
			double temp;
			if (income >= 165000) {
				temp = income - 180000;
				if (temp >= 270000) {
					temp -= 270000;
					tax += (270000 * .1);
				} else {
					tax += (temp * .1);
					temp = 0;
				}
				if (temp > 0 && temp <= 320000) {
					tax += (temp * .15);
					temp -= 320000;
				}
				if (temp > 0 && temp <= 375000) {
					tax += (temp * .2);
					temp -= 320000;
				}
				if (temp > 0) {
					tax += (temp * .25);
				}
			}
			return tax;
		}
	}

	public Report generateReportData(int id) {
		Report report = new Report();
	 	report.setUser(userDao.getUser(id));
		
		User user = new User();
		//user.setName(userDao.get)
		
		
		
		// report.setRegister(registerDao.getRegister(id));
		report.setAgricultureIncome(agricultureIncomeDao
				.getAgricultureIncome(id));
		report.setBusinessOrProfessional(businessOrProfessionalDao.getBusinessOrProfessional(id));
		report.setCapitalGainBusiOther(capitalGainBusiOtherDao
				.getCapitalGainBusiOther(id));
		report.setHouseProperty(housePropertyDao.getHouseProperty(id));
		report.setInvestmentTaxCredit(investmentTaxCreditDao
				.getInvestmentTaxCredit(id));
		report.setParExpenditure(particularsOfExpenditureDao
				.getParticularsOfExpenditure(id));
		report.setSalary(salaryDao.getSalary(id));
		report.setStatementOfAssets(statementOfAssetsDao
				.getStatementOfAssets(id));
		report.setUser(userDao.getUser(id));

		return report;
	}
}
