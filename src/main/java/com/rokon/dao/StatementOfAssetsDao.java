package com.rokon.dao;

import java.util.List;

import com.rokon.domain.StatementOfAssets;

public interface StatementOfAssetsDao {
	public StatementOfAssets getStatementOfAssets(int id);

	public void saveStatementOfAssets(StatementOfAssets statementOfAssets);

	public List<StatementOfAssets> listStatementOfAssets();
}
