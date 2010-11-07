package com.rokon.service;

import com.rokon.dao.SecurityDao;
import com.rokon.domain.Security;
import com.rokon.domain.calUtils;

public class SecurityServiceImpl implements SecurityService {

	SecurityDao securityDao;

	public void setSecurityDao(SecurityDao securityDao) {
		this.securityDao = securityDao;
	}

	@Override
	public void add(Security security) {
		System.out.println("Security added.");
	}

	public calUtils calculateValue(int id) {
		calUtils calUtils = new calUtils();

		double totalIncome = 0;
		double taxableIncome = 0;
		Security security = securityDao.getSecurity(id);
		if (security != null) {
			try {
				double temp;
				temp = Double.parseDouble(security.getInterest_on_bond());
				totalIncome += temp;

				temp = Double.parseDouble(security.getInterest_on_deben());
				totalIncome += temp;

				if (totalIncome > 20000) {
					taxableIncome = taxableIncome - 20000;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		calUtils.setTotalIncome(totalIncome);
		calUtils.setTaxableIncome(taxableIncome);

		return calUtils;
	}
}
