package com.rokon.dao;

import java.util.List;

import com.rokon.domain.InvestmentTaxCredit;

public interface InvestmentTaxCreditDao {
	public InvestmentTaxCredit getInvestmentTaxCredit(int id);

	public void saveInvestmetTaxCredit(InvestmentTaxCredit investmentTaxCredit);

	public List<InvestmentTaxCredit> listInvCredits();
}
