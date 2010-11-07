package com.rokon.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Security {

	@Id
	@GeneratedValue
	private int id;
	private String interest_on_deben;
	private String interest_on_bond; // bond commission/interest

	public String getInterest_on_bond() {
		return interest_on_bond;
	}

	public void setInterest_on_bond(String interestOnBond) {
		interest_on_bond = interestOnBond;
	}

	public String getInterest_on_deben() {
		return interest_on_deben;
	}

	public void setInterest_on_deben(String interestOnDeben) {
		interest_on_deben = interestOnDeben;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

}
