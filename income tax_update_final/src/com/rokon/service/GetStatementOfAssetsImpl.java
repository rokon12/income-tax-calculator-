package com.rokon.service;

import com.rokon.dao.StatementOfAssetsDao;
import com.rokon.domain.StateOfAssets;

public class GetStatementOfAssetsImpl  implements GetStatementOfAssets{
	
	private StatementOfAssetsDao statementOfAssetsDao;

	@Override
	public void add(StateOfAssets statementOfAssets) {
		//System.out.println("Statement Of Assets added successfully..");
		
	}
	
	public double calculateValue(int id) {
		StateOfAssets staOfAssets = statementOfAssetsDao.getStatementOfAssets(id);
		if (staOfAssets != null) {
			try {
				double bankLoan = Double.parseDouble(staOfAssets.getBank_loan());
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return 44;
	}

	public void setStatementOfAssetsDao(StatementOfAssetsDao statementOfAssetsDao) {
		this.statementOfAssetsDao = statementOfAssetsDao;
	}
	
}
