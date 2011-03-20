package com.rokon.service;

import com.rokon.domain.AgricultureIncome;
import com.rokon.domain.CalUtils;

public interface AgricultureIncomeService {
	public void add(AgricultureIncome agricultureIncome);

	public CalUtils calculateValue(int id);
}
