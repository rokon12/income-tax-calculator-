package com.rokon.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ParticularsOfExpenditure {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "per_food_expense")
	private String personalFoodExpense;// Personal and fooding expenses Tk.
	
	@Column(name = "tax_paid_last_year")
	private String taxPaidLastYear;// Tax paid including deduction at source
	// of the last
	// financial year
	
	@Column(name = "acc_exp")
	private String accommodationExpense;// Accommodation expenses
	
	@Column(name = "trans_exp")
	private String transportExpense;// Transport expenses
	
	@Column(name = "gas_bill")
	private String gasBill;// Gas Bill for residence
	
	@Column(name = "electricity_bill")
	private String electricityBill;// Electricity Bill for residence
	
	@Column(name = "wasa_bill")
	private String wasaBill;// Wasa Bill for residence
	
	@Column(name = "education_exp")
	private String educationExpense;// Education expenses for children
	
	@Column(name = "telephone_bill")
	private String telephoneBill;// Telephone Bill for residence
	
	@Column(name = "for_travel_exp")
	private String foreignTravelExpense;// Personal expenses for Foreign travel
	
	@Column(name = "festival_exp")
	private String festivalExpense;// Festival and other special expenses, if any

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getPersonalFoodExpense() {
		return personalFoodExpense;
	}

	public void setPersonalFoodExpense(String personalFoodExpense) {
		this.personalFoodExpense = personalFoodExpense;
	}

	public String getTaxPaidLastYear() {
		return taxPaidLastYear;
	}

	public void setTaxPaidLastYear(String taxPaidLastYear) {
		this.taxPaidLastYear = taxPaidLastYear;
	}

	public String getAccommodationExpense() {
		return accommodationExpense;
	}

	public void setAccommodationExpense(String accommodationExpense) {
		this.accommodationExpense = accommodationExpense;
	}

	public String getTransportExpense() {
		return transportExpense;
	}

	public void setTransportExpense(String transportExpense) {
		this.transportExpense = transportExpense;
	}

	public String getGasBill() {
		return gasBill;
	}

	public void setGasBill(String gasBill) {
		this.gasBill = gasBill;
	}

	public String getElectricityBill() {
		return electricityBill;
	}

	public void setElectricityBill(String electricityBill) {
		this.electricityBill = electricityBill;
	}

	public String getWasaBill() {
		return wasaBill;
	}

	public void setWasaBill(String wasaBill) {
		this.wasaBill = wasaBill;
	}

	public String getEducationExpense() {
		return educationExpense;
	}

	public void setEducationExpense(String educationExpense) {
		this.educationExpense = educationExpense;
	}

	public String getTelephoneBill() {
		return telephoneBill;
	}

	public void setTelephoneBill(String telephoneBill) {
		this.telephoneBill = telephoneBill;
	}

	public String getForeignTravelExpense() {
		return foreignTravelExpense;
	}

	public void setForeignTravelExpense(String foreignTravelExpense) {
		this.foreignTravelExpense = foreignTravelExpense;
	}

	public String getFestivalExpense() {
		return festivalExpense;
	}

	public void setFestivalExpense(String festivalExpense) {
		this.festivalExpense = festivalExpense;
	}
}
