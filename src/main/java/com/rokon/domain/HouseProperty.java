package com.rokon.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class HouseProperty {
	/*
	 * Annual rental income 2. Claimed Expenses : Repair, Collection, etc.
	 * Municipal or Local Tax
	 */
	private int id;
	private String rentalIncome; // Annual rental income
	private String repair;// Repair, Collection, etc.
	private String municipal;// Municipal or Local Tax
	private String landRevenue; // Land Revenue
	private String interestLoanOrMortgage;// Interest on Loan/Mortgage/Capital
	// Charge
	private String insurancePremium;// Insurance Premium
	private String vacancyAllowance;// Vacancy Allowance
	private String other;// Other, if any

	/*
	 * private double rent; private double expense; private String netincome;
	 */

	public void setId(int id) {
		this.id = id;
	}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	@Column(name = "rentalincome")
	public String getRentalIncome() {
		return rentalIncome;
	}

	public void setRentalIncome(String rentalIncome) {
		this.rentalIncome = rentalIncome;
	}

	public String getRepair() {
		return repair;
	}

	public void setRepair(String repair) {
		this.repair = repair;
	}

	public String getMunicipal() {
		return municipal;
	}

	public void setMunicipal(String municipal) {
		this.municipal = municipal;
	}

	@Column(name = "lendrev")
	public String getLandRevenue() {
		return landRevenue;
	}

	public void setLandRevenue(String landRevenue) {
		this.landRevenue = landRevenue;
	}

	@Column(name = "int_loan_or_mortgaze")
	public String getInterestLoanOrMortgage() {
		return interestLoanOrMortgage;
	}

	public void setInterestLoanOrMortgage(String interestLoanOrMortgage) {
		this.interestLoanOrMortgage = interestLoanOrMortgage;
	}

	@Column(name = "insu_prem")
	public String getInsurancePremium() {
		return insurancePremium;
	}

	public void setInsurancePremium(String insurancePremium) {
		this.insurancePremium = insurancePremium;
	}

	@Column(name = "vacan_all")
	public String getVacancyAllowance() {
		return vacancyAllowance;
	}

	public void setVacancyAllowance(String vacancyAllowance) {
		this.vacancyAllowance = vacancyAllowance;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

}
