package com.rokon.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Security {

	@Id
	@GeneratedValue
	private int id;
	private String interestOnDebenture;
	private String interestOnBond; // bond commission/interest

	@Column(name = "interest_on_bond")
	public String getInterestOnBond() {
		return interestOnBond;
	}

	public void setInterestOnBond(String interestOnBond) {
		this.interestOnBond = interestOnBond;
	}

	@Column(name = "interest_on_deben")
	public String getInterestOnDebenture() {
		return interestOnDebenture;
	}

	public void setInterestOnDebenture(String interestOnDebenture) {
		this.interestOnDebenture = interestOnDebenture;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

}
