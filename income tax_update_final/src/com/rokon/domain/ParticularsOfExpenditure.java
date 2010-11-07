package com.rokon.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ParticularsOfExpenditure {

	private int id;
	private String per_food_expense;// Personal and fooding expenses Tk.
	private String tax_paid_last_year;// Tax paid including deduction at source
	// of the last
	// financial year
	private String acc_exp;// Accommodation expenses
	private String trans_exp;// Transport expenses
	private String gas_bill;// Gas Bill for residence
	private String electricity_bill;// Electricity Bill for residence
	private String wasa_bill;// Wasa Bill for residence
	private String education_exp;// Education expenses for children
	private String telephone_bill;// Telephone Bill for residence
	private String for_travel_exp;// Personal expenses for Foreign travel
	private String festival_exp;// Festival and other special expenses, if any

	public void setId(int id) {
		this.id = id;
	}

	@Id
	public int getId() {
		return id;
	}

	public String getPer_food_expense() {
		return per_food_expense;
	}

	public void setPer_food_expense(String perFoodExpense) {
		per_food_expense = perFoodExpense;
	}

	public String getTax_paid_last_year() {
		return tax_paid_last_year;
	}

	public void setTax_paid_last_year(String taxPaidLastYear) {
		tax_paid_last_year = taxPaidLastYear;
	}

	public String getAcc_exp() {
		return acc_exp;
	}

	public void setAcc_exp(String accExp) {
		acc_exp = accExp;
	}

	public String getTrans_exp() {
		return trans_exp;
	}

	public void setTrans_exp(String transExp) {
		trans_exp = transExp;
	}

	public String getGas_bill() {
		return gas_bill;
	}

	public void setGas_bill(String gasBill) {
		gas_bill = gasBill;
	}

	public String getElectricity_bill() {
		return electricity_bill;
	}

	public void setElectricity_bill(String electricityBill) {
		electricity_bill = electricityBill;
	}

	public String getWasa_bill() {
		return wasa_bill;
	}

	public void setWasa_bill(String wasaBill) {
		wasa_bill = wasaBill;
	}

	public String getEducation_exp() {
		return education_exp;
	}

	public void setEducation_exp(String educationExp) {
		education_exp = educationExp;
	}

	public String getTelephone_bill() {
		return telephone_bill;
	}

	public void setTelephone_bill(String telephoneBill) {
		telephone_bill = telephoneBill;
	}

	public String getFor_travel_exp() {
		return for_travel_exp;
	}

	public void setFor_travel_exp(String forTravelExp) {
		for_travel_exp = forTravelExp;
	}

	public String getFestival_exp() {
		return festival_exp;
	}

	public void setFestival_exp(String festivalExp) {
		festival_exp = festivalExp;
	}
}
