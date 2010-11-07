package com.rokon.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BussiOrProff {
	@Id
	@GeneratedValue
	private int id;
	private String bussi_or_proff; // income from bussiness or proffesion
	private String share_profit;
	private String income_spouse_child; // Income of the spouse or minor child

	// as applicable
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBussi_or_proff() {
		return bussi_or_proff;
	}

	public void setBussi_or_proff(String bussiOrProff) {
		bussi_or_proff = bussiOrProff;
	}

	public String getShare_profit() {
		return share_profit;
	}

	public void setShare_profit(String shareProfit) {
		share_profit = shareProfit;
	}

	public String getIncome_spouse_child() {
		return income_spouse_child;
	}

	public void setIncome_spouse_child(String incomeSpouseChild) {
		income_spouse_child = incomeSpouseChild;
	}

}
