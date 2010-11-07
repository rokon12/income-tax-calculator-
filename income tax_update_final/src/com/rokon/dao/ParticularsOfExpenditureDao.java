package com.rokon.dao;

import java.util.List;

import com.rokon.domain.ParticularsOfExpenditure;

public interface ParticularsOfExpenditureDao {
	public ParticularsOfExpenditure getParticularsOfExpenditure(int id);

	public List<ParticularsOfExpenditure> getParticularsOfExpenditure();

	public void saveParticularsOfExpenditure(
			ParticularsOfExpenditure particularsOfExpenditure);
}
