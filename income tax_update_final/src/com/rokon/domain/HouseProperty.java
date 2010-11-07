package com.rokon.domain;

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
	private String rentalincome; // Annual rental income
	private String repair;// Repair, Collection, etc.
	private String municipal;// Municipal or Local Tax
	private String lendrev; // Land Revenue
	private String int_loan_or_mortgaze;// Interest on Loan/Mortgage/Capital
	// Charge
	private String insu_prem;// Insurance Premium
	private String vacan_all;// Vacancy Allowance
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

	public String getRentalincome() {
		return rentalincome;
	}

	public void setRentalincome(String rentalincome) {
		this.rentalincome = rentalincome;
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

	public String getLendrev() {
		return lendrev;
	}

	public void setLendrev(String lendrev) {
		this.lendrev = lendrev;
	}

	public String getInt_loan_or_mortgaze() {
		return int_loan_or_mortgaze;
	}

	public void setInt_loan_or_mortgaze(String intLoanOrMortgaze) {
		int_loan_or_mortgaze = intLoanOrMortgaze;
	}

	public String getInsu_prem() {
		return insu_prem;
	}

	public void setInsu_prem(String insuPrem) {
		insu_prem = insuPrem;
	}

	public String getVacan_all() {
		return vacan_all;
	}

	public void setVacan_all(String vacanAll) {
		vacan_all = vacanAll;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

}
