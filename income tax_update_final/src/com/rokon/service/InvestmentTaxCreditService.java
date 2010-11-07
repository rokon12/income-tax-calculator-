package com.rokon.service;

import com.rokon.domain.InvestmentTaxCredit;

public interface InvestmentTaxCreditService {
	public void add(InvestmentTaxCredit investmentTaxCredit);

	public double calculateValue(int id);
}
