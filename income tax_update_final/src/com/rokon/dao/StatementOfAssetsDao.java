package com.rokon.dao;

import java.util.List;

import com.rokon.domain.StateOfAssets;

public interface StatementOfAssetsDao {
	public StateOfAssets getStatementOfAssets(int id);

	public void saveStatementOfAssets(StateOfAssets statementOfAssets);

	public List<StateOfAssets> listStatementOfAssets();
}
