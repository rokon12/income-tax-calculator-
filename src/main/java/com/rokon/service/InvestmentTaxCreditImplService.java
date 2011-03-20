package com.rokon.service;

import com.rokon.dao.InvestmentTaxCreditDao;
import com.rokon.domain.InvestmentTaxCredit;

public class InvestmentTaxCreditImplService implements
		InvestmentTaxCreditService {
	InvestmentTaxCreditDao investmentTaxCreditDao;

	public void setInvestmentTaxCreditDao(
			InvestmentTaxCreditDao investmentTaxCreditDao) {
		this.investmentTaxCreditDao = investmentTaxCreditDao;
	}

	@Override
	public void add(InvestmentTaxCredit investmentTaxCredit) {
		System.out.println("Investment Tax Credit added successfully");
	}

	public double calculateValue(int id) {
		InvestmentTaxCredit investmentTaxCredit = investmentTaxCreditDao
				.getInvestmentTaxCredit(id);

		double temp = 0;
		if (investmentTaxCredit != null) {
			try {
				temp += Double.parseDouble(investmentTaxCredit.getAnnuity());
				temp += Double.parseDouble(investmentTaxCredit.getBenevolent());
				temp += Double.parseDouble(investmentTaxCredit
						.getContributionProvidentFund());
				temp += Double.parseDouble(investmentTaxCredit
						.getContributionSuperAnnuation());
				temp += Double.parseDouble(investmentTaxCredit.getDeposit());
				temp += Double.parseDouble(investmentTaxCredit
						.getLifeInsurancePremium());
				temp += Double.parseDouble(investmentTaxCredit.getOthers());
				temp += Double.parseDouble(investmentTaxCredit
						.getSelfContributionProvidentFund());
				temp += Double
						.parseDouble(investmentTaxCredit.getStockShare());
				temp += Double.parseDouble(investmentTaxCredit.getZakat());

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		return temp;
	}
}
