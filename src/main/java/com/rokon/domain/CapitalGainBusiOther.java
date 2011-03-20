package com.rokon.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CapitalGainBusiOther {
	@Id
	@GeneratedValue
	private int id;
	@Column(name = "capital_gain")
	private String capitalGain;
	
	@Column(name = "foreign_income")
	private String foreignIncome;
	
	@Column(name = "other_source")
	private String otherSource;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCapitalGain() {
		return capitalGain;
	}

	public void setCapitalGain(String capitalGain) {
		this.capitalGain = capitalGain;
	}

	public String getForeignIncome() {
		return foreignIncome;
	}

	public void setForeignIncome(String foreignIncome) {
		this.foreignIncome = foreignIncome;
	}

	public String getOtherSource() {
		return otherSource;
	}

	public void setOtherSource(String otherSource) {
		this.otherSource = otherSource;
	}

}
