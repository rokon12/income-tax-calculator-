package com.rokon.service;

import com.rokon.dao.StatementOfAssetsDao;
import com.rokon.domain.StatementOfAssets;

public class StatementOfAssetsServiceImpl implements StatementOfAssetsService {

	private StatementOfAssetsDao statementOfAssetsDao;

	@Override
	public void add(StatementOfAssets statementOfAssets) {
		if (statementOfAssets != null) {
			statementOfAssetsDao.saveStatementOfAssets(statementOfAssets);
			System.out.println("Statement Of Assets added successfully..");
		}
	}

	public double calculateValue(int id) {
		StatementOfAssets staOfAssets = statementOfAssetsDao
				.getStatementOfAssets(id);
		if (staOfAssets != null) {
			try {
				double bankLoan = Double
						.parseDouble(staOfAssets.getBankLoan());

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return 44;
	}

	public void setStatementOfAssetsDao(
			StatementOfAssetsDao statementOfAssetsDao) {
		this.statementOfAssetsDao = statementOfAssetsDao;
	}

}
