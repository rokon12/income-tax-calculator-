package com.rokon.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StatementOfAssets {
	
	private int id;
	private String businesscap; // business Capital
	@Column(name = "limit_com_cost")
	private String limitComCost; // Directors Shareholdings in Limited
	// Companies ( at cost)
	// -----------------------

	private String nameofcompany; // name of companies
	private String numberofshare; // Number of Shares
	private String cost; // taka

	// ------------
	private String nonagriculturepro; // Non-Agricultural Property (at cost with
	// legal expenses )
	@Column(name = "detail_of_non")
	private String detailOfNon; // Land/House property (Description and
	// location of property)
	@Column(name = "agriculture_property")
	private String agricultureProperty;// Agricultural Property (at cost with
	// legal expenses ) :
	@Column(name = "details_of_land")
	private String detailsOfLand; // Land (Total land and location of land
	// property)

	// Investments
	private String shares; // Shares/Debentures
	@Column(name = "saving_cirtificate")
	private String savingCertificate; // Saving Certificate/Unit
	// Certificate/Bond
	@Column(name = "prize_bond")
	private String prizeBond; // Prize bond/Savings Scheme
	@Column(name = "loans_given")
	private String loansGiven; // Loans given
	@Column(name = "others_invest")
	private String othersInvest; // Other Investment

	// Motor Vehicles (at cost) :
	@Column(name = "motor_vehicles")
	private String motorVehicles; //
	@Column(name = "motor_types")
	private String motorTypes;
	@Column(name = "motor_regi_number")
	private String motorRegiNumber;

	// Jewellery (quantity and cost) :
	@Column(name = "jewellery_quantity")
	private String jewelleryQuantity;
	@Column(name = "j_cost")
	private String jewelleryCost;

	@Column(name = "furniture_cost")
	private String furnitureCost; //  
	@Column(name = "electric_equipment")
	private String electricEquipment; // Electronic Equipment (at cost) :

	// Cash Asset Outside Business:
	@Column(name = "cash_at_hand")
	private String cashAtHand;
	@Column(name = "cash_at_bank")
	private String cashAtBank;
	@Column(name = "other_deposite")
	private String otherDeposit;

	// any other asset
	@Column(name = "any_other")
	private String anyOther;
	@Column(name = "other_details")
	private String otherDetails;

	// Less Liabilities:
	private String mortgages; // Mortgages secured on property or land
	@Column(name = "unsecured_loan")
	private String unsecuredLoan; // Unsecured loans
	@Column(name = "bank_loan")
	private String bankLoan; // Bank Loan
	private String others;

	// Net wealth as on last date of previous income year
	@Column(name = "net_wealth")
	private String netWealth;

	// Family Expenditure
	@Column(name = "family_expen")
	private String familyExpenditure;
	@Column(name = "num_adult")
	private String numAdult;
	@Column(name = "num_child")
	private String numChild;


	@Column(name = "shown_return_income")
	private String shownReturnIncome;
	@Column(name = "tax_exepted")
	private String taxExempted;
	@Column(name = "other_receipts")
	private String otherReceipts;

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

	public String getLimitComCost() {
		return limitComCost;
	}

	public void setLimitComCost(String limitComCost) {
		this.limitComCost = limitComCost;
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

	public String getDetailOfNon() {
		return detailOfNon;
	}

	public void setDetailOfNon(String detailOfNon) {
		this.detailOfNon = detailOfNon;
	}

	public String getAgricultureProperty() {
		return agricultureProperty;
	}

	public void setAgricultureProperty(String agricultureProperty) {
		this.agricultureProperty = agricultureProperty;
	}

	public String getDetailsOfLand() {
		return detailsOfLand;
	}

	public void setDetailsOfLand(String detailsOfLand) {
		this.detailsOfLand = detailsOfLand;
	}

	public String getShares() {
		return shares;
	}

	public void setShares(String shares) {
		this.shares = shares;
	}

	public String getSavingCertificate() {
		return savingCertificate;
	}

	public void setSavingCertificate(String savingCertificate) {
		this.savingCertificate = savingCertificate;
	}

	public String getPrizeBond() {
		return prizeBond;
	}

	public void setPrizeBond(String prizeBond) {
		this.prizeBond = prizeBond;
	}

	public String getLoansGiven() {
		return loansGiven;
	}

	public void setLoansGiven(String loansGiven) {
		this.loansGiven = loansGiven;
	}

	public String getOthersInvest() {
		return othersInvest;
	}

	public void setOthersInvest(String othersInvest) {
		this.othersInvest = othersInvest;
	}

	public String getMotorVehicles() {
		return motorVehicles;
	}

	public void setMotorVehicles(String motorVehicles) {
		this.motorVehicles = motorVehicles;
	}

	public String getMotorTypes() {
		return motorTypes;
	}

	public void setMotorTypes(String motorTypes) {
		this.motorTypes = motorTypes;
	}

	public String getMotorRegiNumber() {
		return motorRegiNumber;
	}

	public void setMotorRegiNumber(String motorRegiNumber) {
		this.motorRegiNumber = motorRegiNumber;
	}

	public String getJewelleryQuantity() {
		return jewelleryQuantity;
	}

	public void setJewelleryQuantity(String jewelleryQuantity) {
		this.jewelleryQuantity = jewelleryQuantity;
	}

	public String getJewelleryCost() {
		return jewelleryCost;
	}

	public void setJewelleryCost(String jewelleryCost) {
		this.jewelleryCost = jewelleryCost;
	}

	public String getFurnitureCost() {
		return furnitureCost;
	}

	public void setFurnitureCost(String furnitureCost) {
		this.furnitureCost = furnitureCost;
	}

	public String getElectricEquipment() {
		return electricEquipment;
	}

	public void setElectricEquipment(String electricEquipment) {
		this.electricEquipment = electricEquipment;
	}

	public String getCashAtHand() {
		return cashAtHand;
	}

	public void setCashAtHand(String cashAtHand) {
		this.cashAtHand = cashAtHand;
	}

	public String getCashAtBank() {
		return cashAtBank;
	}

	public void setCashAtBank(String cashAtBank) {
		this.cashAtBank = cashAtBank;
	}

	public String getOtherDeposit() {
		return otherDeposit;
	}

	public void setOtherDeposit(String otherDeposit) {
		this.otherDeposit = otherDeposit;
	}

	public String getAnyOther() {
		return anyOther;
	}

	public void setAnyOther(String anyOther) {
		this.anyOther = anyOther;
	}

	public String getOtherDetails() {
		return otherDetails;
	}

	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}

	public String getMortgages() {
		return mortgages;
	}

	public void setMortgages(String mortgages) {
		this.mortgages = mortgages;
	}

	public String getUnsecuredLoan() {
		return unsecuredLoan;
	}

	public void setUnsecuredLoan(String unsecuredLoan) {
		this.unsecuredLoan = unsecuredLoan;
	}

	public String getBankLoan() {
		return bankLoan;
	}

	public void setBankLoan(String bankLoan) {
		this.bankLoan = bankLoan;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}

	public String getNetWealth() {
		return netWealth;
	}

	public void setNetWealth(String netWealth) {
		this.netWealth = netWealth;
	}

	public String getFamilyExpenditure() {
		return familyExpenditure;
	}

	public void setFamilyExpenditure(String familyExpenditure) {
		this.familyExpenditure = familyExpenditure;
	}

	public String getNumAdult() {
		return numAdult;
	}

	public void setNumAdult(String numAdult) {
		this.numAdult = numAdult;
	}

	public String getNumChild() {
		return numChild;
	}

	public void setNumChild(String numChild) {
		this.numChild = numChild;
	}

	public String getShownReturnIncome() {
		return shownReturnIncome;
	}

	public void setShownReturnIncome(String shownReturnIncome) {
		this.shownReturnIncome = shownReturnIncome;
	}

	public String getTaxExempted() {
		return taxExempted;
	}

	public void setTaxExempted(String taxExempted) {
		this.taxExempted = taxExempted;
	}

	public String getOtherReceipts() {
		return otherReceipts;
	}

	public void setOtherReceipts(String otherReceipts) {
		this.otherReceipts = otherReceipts;
	}
}
