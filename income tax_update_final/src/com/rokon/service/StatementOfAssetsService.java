package com.rokon.service;

import com.rokon.domain.StateOfAssets;

public interface StatementOfAssetsService {
	public void add(StateOfAssets statementOfAssets);

	public double calculateValue(int id);
}
