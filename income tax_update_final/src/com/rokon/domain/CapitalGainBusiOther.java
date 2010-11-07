package com.rokon.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CapitalGainBusiOther {
	@Id
	@GeneratedValue
	private int id;
	private String capital_gain;
	private String foreign_income;
	private String other_source;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCapital_gain() {
		return capital_gain;
	}

	public void setCapital_gain(String capitalGain) {
		capital_gain = capitalGain;
	}

	public String getForeign_income() {
		return foreign_income;
	}

	public void setForeign_income(String foreignIncome) {
		foreign_income = foreignIncome;
	}

	public String getOther_source() {
		return other_source;
	}

	public void setOther_source(String otherSource) {
		other_source = otherSource;
	}

}
