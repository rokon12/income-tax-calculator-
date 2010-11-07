package com.rokon.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StateOfAssets {
	
	private int id;
	private String businesscap; // business Capital
	private String limit_com_cost; // Directors Shareholdings in Limited
	// Companies ( at cost)
	// -----------------------

	private String nameofcompany; // name of companies
	private String numberofshare; // Number of Shares
	private String cost; // taka

	// ------------
	private String nonagriculturepro; // Non-Agricultural Property (at cost with
	// legal expenses )
	private String detail_of_non; // Land/House property (Description and
	// location of property)
	private String agriculture_property;// Agricultural Property (at cost with
	// legal expenses ) :
	private String details_of_land; // Land (Total land and location of land
	// property)

	// Investments
	private String shares; // Shares/Debentures
	private String saving_cirtificate; // Saving Certificate/Unit
	// Certificate/Bond
	private String prize_bond; // Prize bond/Savings Scheme
	private String loans_given; // Loans given
	private String others_invest; // Other Investment

	// Motor Vehicles (at cost) :
	private String motor_vehicles; //
	private String motor_types;
	private String motor_regi_number;

	// Jewellery (quantity and cost) :
	private String jewellery_quantity;
	private String j_cost;

	private String furniture_cost; //  
	private String electric_equipment; // Electronic Equipment (at cost) :

	// Cash Asset Outside Business:
	private String cash_at_hand;
	private String cash_at_bank;
	private String other_deposite;

	// any other asset
	private String any_other;
	private String other_details;

	// Less Liabilities:
	private String mortgages; // Mortgages secured on property or land
	private String unsecured_loan; // Unsecured loans
	private String bank_loan; // Bank Loan
	private String others;

	// Net wealth as on last date of previous income year
	private String net_wealth;

	// Family Expenditure
	private String family_expen;
	private String num_adult;
	private String num_child;


	private String shown_return_income;
	private String tax_exepted;
	private String other_receipts;

	public void setId(int id) {
		this.id = id;
	}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public String getBusinesscap() {
		return businesscap;
	}

	public void setBusinesscap(String businesscap) {
		this.businesscap = businesscap;
	}

	public String getLimit_com_cost() {
		return limit_com_cost;
	}

	public void setLimit_com_cost(String limitComCost) {
		limit_com_cost = limitComCost;
	}

	public String getNameofcompany() {
		return nameofcompany;
	}

	public void setNameofcompany(String nameofcompany) {
		this.nameofcompany = nameofcompany;
	}

	public String getNumberofshare() {
		return numberofshare;
	}

	public void setNumberofshare(String numberofshare) {
		this.numberofshare = numberofshare;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getNonagriculturepro() {
		return nonagriculturepro;
	}

	public void setNonagriculturepro(String nonagriculturepro) {
		this.nonagriculturepro = nonagriculturepro;
	}

	public String getDetail_of_non() {
		return detail_of_non;
	}

	public void setDetail_of_non(String detailOfNon) {
		detail_of_non = detailOfNon;
	}

	public String getAgriculture_property() {
		return agriculture_property;
	}

	public void setAgriculture_property(String agricultureProperty) {
		agriculture_property = agricultureProperty;
	}

	public String getDetails_of_land() {
		return details_of_land;
	}

	public void setDetails_of_land(String detailsOfLand) {
		details_of_land = detailsOfLand;
	}

	public String getShares() {
		return shares;
	}

	public void setShares(String shares) {
		this.shares = shares;
	}

	public String getSaving_cirtificate() {
		return saving_cirtificate;
	}

	public void setSaving_cirtificate(String savingCirtificate) {
		saving_cirtificate = savingCirtificate;
	}

	public String getPrize_bond() {
		return prize_bond;
	}

	public void setPrize_bond(String prizeBond) {
		prize_bond = prizeBond;
	}

	public String getLoans_given() {
		return loans_given;
	}

	public void setLoans_given(String loansGiven) {
		loans_given = loansGiven;
	}

	public String getOthers_invest() {
		return others_invest;
	}

	public void setOthers_invest(String othersInvest) {
		others_invest = othersInvest;
	}

	public String getMotor_vehicles() {
		return motor_vehicles;
	}

	public void setMotor_vehicles(String motorVehicles) {
		motor_vehicles = motorVehicles;
	}

	public String getMotor_types() {
		return motor_types;
	}

	public void setMotor_types(String motorTypes) {
		motor_types = motorTypes;
	}

	public String getMotor_regi_number() {
		return motor_regi_number;
	}

	public void setMotor_regi_number(String motorRegiNumber) {
		motor_regi_number = motorRegiNumber;
	}

	public String getJewellery_quantity() {
		return jewellery_quantity;
	}

	public void setJewellery_quantity(String jewelleryQuantity) {
		jewellery_quantity = jewelleryQuantity;
	}

	public String getJ_cost() {
		return j_cost;
	}

	public void setJ_cost(String jCost) {
		j_cost = jCost;
	}

	public String getFurniture_cost() {
		return furniture_cost;
	}

	public void setFurniture_cost(String furnitureCost) {
		furniture_cost = furnitureCost;
	}

	public String getElectric_equipment() {
		return electric_equipment;
	}

	public void setElectric_equipment(String electricEquipment) {
		electric_equipment = electricEquipment;
	}

	public String getCash_at_hand() {
		return cash_at_hand;
	}

	public void setCash_at_hand(String cashAtHand) {
		cash_at_hand = cashAtHand;
	}

	public String getCash_at_bank() {
		return cash_at_bank;
	}

	public void setCash_at_bank(String cashAtBank) {
		cash_at_bank = cashAtBank;
	}

	public String getOther_deposite() {
		return other_deposite;
	}

	public void setOther_deposite(String otherDeposite) {
		other_deposite = otherDeposite;
	}

	public String getAny_other() {
		return any_other;
	}

	public void setAny_other(String anyOther) {
		any_other = anyOther;
	}

	public String getOther_details() {
		return other_details;
	}

	public void setOther_details(String otherDetails) {
		other_details = otherDetails;
	}

	public String getMortgages() {
		return mortgages;
	}

	public void setMortgages(String mortgages) {
		this.mortgages = mortgages;
	}

	public String getUnsecured_loan() {
		return unsecured_loan;
	}

	public void setUnsecured_loan(String unsecuredLoan) {
		unsecured_loan = unsecuredLoan;
	}

	public String getBank_loan() {
		return bank_loan;
	}

	public void setBank_loan(String bankLoan) {
		bank_loan = bankLoan;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}

	public String getNet_wealth() {
		return net_wealth;
	}

	public void setNet_wealth(String netWealth) {
		net_wealth = netWealth;
	}

	public String getFamily_expen() {
		return family_expen;
	}

	public void setFamily_expen(String familyExpen) {
		family_expen = familyExpen;
	}

	public String getNum_adult() {
		return num_adult;
	}

	public void setNum_adult(String numAdult) {
		num_adult = numAdult;
	}

	public String getNum_child() {
		return num_child;
	}

	public void setNum_child(String numChild) {
		num_child = numChild;
	}

	public String getShown_return_income() {
		return shown_return_income;
	}

	public void setShown_return_income(String shownReturnIncome) {
		shown_return_income = shownReturnIncome;
	}

	public String getTax_exepted() {
		return tax_exepted;
	}

	public void setTax_exepted(String taxExepted) {
		tax_exepted = taxExepted;
	}

	public String getOther_receipts() {
		return other_receipts;
	}

	public void setOther_receipts(String otherReceipts) {
		other_receipts = otherReceipts;
	}
}
