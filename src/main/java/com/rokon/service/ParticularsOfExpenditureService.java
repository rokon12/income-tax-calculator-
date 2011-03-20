package com.rokon.service;

import com.rokon.domain.ParticularsOfExpenditure;

public interface ParticularsOfExpenditureService {
	public void add(ParticularsOfExpenditure particularsOfExpenditure);

	public double calculateValue(int id);
}
