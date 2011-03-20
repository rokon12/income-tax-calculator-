package com.rokon.service;

import com.rokon.domain.InvestmentTaxCredit;

public class GetInvestmentTaxCreditImpl implements GetInvestmentTaxCredit {

	@Override
	public void add(InvestmentTaxCredit investmentTaxCredit) {
		System.out.println("Investment Tax Credit added successfully");
	}
}
