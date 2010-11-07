package com.rokon.domain;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class InvestmentTaxCredit {

	private int id;
	private String life_insu_prem = "0"; // Life insurance premium
	private String contri_provi_fund = "0"; // Contribution to Provident Fund to
	// which
	// Provident Fund
	private String self_contri_provifund = "0"; // Self contribution and
	// employer’s
	// contribution to
	// Recognized Provident Fund
	private String annuity = "0"; // Contribution to deferred annuity

	private String contri_super_ann = "0"; // Contribution to Super Annuation
	// Fund
	private String stock_share = "0"; // Investment in approved debenture or
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

	public String getLife_insu_prem() {
		return life_insu_prem;
	}

	public void setLife_insu_prem(String lifeInsuPrem) {
		life_insu_prem = lifeInsuPrem;
	}

	public String getContri_provi_fund() {
		return contri_provi_fund;
	}

	public void setContri_provi_fund(String contriProviFund) {
		contri_provi_fund = contriProviFund;
	}

	public String getSelf_contri_provifund() {
		return self_contri_provifund;
	}

	public void setSelf_contri_provifund(String selfContriProvifund) {
		self_contri_provifund = selfContriProvifund;
	}

	public String getAnnuity() {
		return annuity;
	}

	public void setAnnuity(String annuity) {
		this.annuity = annuity;
	}

	public String getContri_super_ann() {
		return contri_super_ann;
	}

	public void setContri_super_ann(String contriSuperAnn) {
		contri_super_ann = contriSuperAnn;
	}

	public String getStock_share() {
		return stock_share;
	}

	public void setStock_share(String stockShare) {
		stock_share = stockShare;
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
