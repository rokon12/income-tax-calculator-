package com.rokon.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BusinessOrProfessional {
	@Id
	@GeneratedValue
	private int id;
	private String businessOrProfession; // income from business or profession
	private String shareProfit;
	private String incomeSpouseChild; // Income of the spouse or minor child

	// as applicable
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBusinessOrProfession() {
		return businessOrProfession;
	}

	public void setBusinessOrProfession(String businessOrProfession) {
		this.businessOrProfession = businessOrProfession;
	}

	public String getShareProfit() {
		return shareProfit;
	}

	public void setShareProfit(String shareProfit) {
		this.shareProfit = shareProfit;
	}

	public String getIncomeSpouseChild() {
		return incomeSpouseChild;
	}

	public void setIncomeSpouseChild(String incomeSpouseChild) {
		this.incomeSpouseChild = incomeSpouseChild;
	}

}
