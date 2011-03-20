package com.rokon.service;

import com.rokon.domain.StatementOfAssets;

public interface StatementOfAssetsService {
	public void add(StatementOfAssets statementOfAssets);

	public double calculateValue(int id);
}
