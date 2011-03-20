package com.rokon.domain;



public class Report {
	int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private User user;
	private Register register;
	private Salary salary;
	private HouseProperty houseProperty;
	private Security security;
	private ParticularsOfExpenditure parExpenditure;
	private StatementOfAssets statementOfAssets;
	private BusinessOrProfessional businessOrProfessional;
	private CapitalGainBusiOther capitalGainBusiOther;
	private AgricultureIncome agricultureIncome;
	private InvestmentTaxCredit investmentTaxCredit;

	public User getUser() {
		return user;
	}

	public Register getRegister() {
		return register;
	}

	public void setRegister(Register register) {
		this.register = register;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	public HouseProperty getHouseProperty() {
		return houseProperty;
	}

	public void setHouseProperty(HouseProperty houseProperty) {
		this.houseProperty = houseProperty;
	}

	public Security getSecurity() {
		return security;
	}

	public void setSecurity(Security security) {
		this.security = security;
	}

	public ParticularsOfExpenditure getParExpenditure() {
		return parExpenditure;
	}

	public void setParExpenditure(ParticularsOfExpenditure parExpenditure) {
		this.parExpenditure = parExpenditure;
	}

	public StatementOfAssets getStatementOfAssets() {
		return statementOfAssets;
	}

	public void setStatementOfAssets(StatementOfAssets statementOfAssets) {
		this.statementOfAssets = statementOfAssets;
	}

	public BusinessOrProfessional getBusinessOrProfessional() {
		return businessOrProfessional;
	}

	public void setBusinessOrProfessional(BusinessOrProfessional businessOrProfessional) {
		this.businessOrProfessional = businessOrProfessional;
	}

	public CapitalGainBusiOther getCapitalGainBusiOther() {
		return capitalGainBusiOther;
	}

	public void setCapitalGainBusiOther(
			CapitalGainBusiOther capitalGainBusiOther) {
		this.capitalGainBusiOther = capitalGainBusiOther;
	}

	public AgricultureIncome getAgricultureIncome() {
		return agricultureIncome;
	}

	public void setAgricultureIncome(AgricultureIncome agricultureIncome) {
		this.agricultureIncome = agricultureIncome;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setInvestmentTaxCredit(InvestmentTaxCredit investmentTaxCredit) {
		this.investmentTaxCredit = investmentTaxCredit;
	}

	public InvestmentTaxCredit getInvestmentTaxCredit() {
		return investmentTaxCredit;
	}

}
