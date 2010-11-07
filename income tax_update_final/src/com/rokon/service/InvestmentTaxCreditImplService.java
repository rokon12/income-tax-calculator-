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
						.getContri_provi_fund());
				temp += Double.parseDouble(investmentTaxCredit
						.getContri_super_ann());
				temp += Double.parseDouble(investmentTaxCredit.getDeposit());
				temp += Double.parseDouble(investmentTaxCredit
						.getLife_insu_prem());
				temp += Double.parseDouble(investmentTaxCredit.getOthers());
				temp += Double.parseDouble(investmentTaxCredit
						.getSelf_contri_provifund());
				temp += Double
						.parseDouble(investmentTaxCredit.getStock_share());
				temp += Double.parseDouble(investmentTaxCredit.getZakat());

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		return temp;
	}
}
