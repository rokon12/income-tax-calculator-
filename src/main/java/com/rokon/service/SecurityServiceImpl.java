package com.rokon.service;

import com.rokon.dao.SecurityDao;
import com.rokon.domain.Security;
import com.rokon.domain.CalUtils;

public class SecurityServiceImpl implements SecurityService {

	SecurityDao securityDao;

	public void setSecurityDao(SecurityDao securityDao) {
		this.securityDao = securityDao;
	}

	@Override
	public void add(Security security) {
		System.out.println("Security added.");
	}

	public CalUtils calculateValue(int id) {
		CalUtils calUtils = new CalUtils();

		double totalIncome = 0;
		double taxableIncome = 0;
		Security security = securityDao.getSecurity(id);
		if (security != null) {
			try {
				double temp;
				temp = Double.parseDouble(security.getInterestOnBond());
				totalIncome += temp;

				temp = Double.parseDouble(security.getInterestOnDebenture());
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
