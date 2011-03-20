package com.rokon.domain;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class InvestmentTaxCredit {

	private int id;
	private String lifeInsurancePremium = "0"; // Life insurance premium
	private String contributionProvidentFund = "0"; // Contribution to Provident Fund to
	// which
	// Provident Fund
	private String selfContributionProvidentFund = "0"; // Self contribution and
	// employer’s
	// contribution to
	// Recognized Provident Fund
	private String annuity = "0"; // Contribution to deferred annuity

	private String contributionSuperAnnuation = "0"; // Contribution to Super Annuation
	// Fund
	private String stockShare = "0"; // Investment in approved debenture or
	// debenture
	// stock,
	// Stock or Shares
	private String deposit = "0"; // Contribution to deposit pension scheme
	private String zakat = "0"; // Contribution to Zakat Fund
	private String benevolent = "0"; // Contribution to Benevolent Fund and
	// Group
	// Insurance premium
	private String others = "0"; // Others, if any
	private String details = "0";

	private ArrayList<String> list;

	public void setId(int id) {
		this.id = id;
	}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	@Column(name = "life_insu_prem")
	public String getLifeInsurancePremium() {
		return lifeInsurancePremium;
	}

	public void setLifeInsurancePremium(String lifeInsurancePremium) {
		this.lifeInsurancePremium = lifeInsurancePremium;
	}

	@Column(name = "contri_provi_fund")
	public String getContributionProvidentFund() {
		return contributionProvidentFund;
	}

	public void setContributionProvidentFund(String contributionProvidentFund) {
		this.contributionProvidentFund = contributionProvidentFund;
	}

	@Column(name = "self_contri_provifund")
	public String getSelfContributionProvidentFund() {
		return selfContributionProvidentFund;
	}

	public void setSelfContributionProvidentFund(String selfContributionProvidentFund) {
		this.selfContributionProvidentFund = selfContributionProvidentFund;
	}

	public String getAnnuity() {
		return annuity;
	}

	public void setAnnuity(String annuity) {
		this.annuity = annuity;
	}

	@Column(name = "contri_super_ann")
	public String getContributionSuperAnnuation() {
		return contributionSuperAnnuation;
	}

	public void setContributionSuperAnnuation(String contributionSuperAnnuation) {
		this.contributionSuperAnnuation = contributionSuperAnnuation;
	}

	@Column(name = "stock_share")
	public String getStockShare() {
		return stockShare;
	}

	public void setStockShare(String stockShare) {
		this.stockShare = stockShare;
	}

	public String getDeposit() {
		return deposit;
	}

	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

	public String getZakat() {
		return zakat;
	}

	public void setZakat(String zakat) {
		this.zakat = zakat;
	}

	public String getBenevolent() {
		return benevolent;
	}

	public void setBenevolent(String benevolent) {
		this.benevolent = benevolent;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	public ArrayList<String> getList() {
		return list;
	}
}
