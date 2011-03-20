package com.rokon.service;

import com.rokon.domain.ParticularsOfExpenditure;

public class GetParticularsOfExpenditureImpl implements GetParticularsOfExpenditure{

	@Override
	public void add(ParticularsOfExpenditure particularsOfExpenditure) {
		System.out.println("Particular of Expenditure added successfully");
	}
}
