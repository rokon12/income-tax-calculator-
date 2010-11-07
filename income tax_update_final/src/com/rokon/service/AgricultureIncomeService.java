package com.rokon.service;

import com.rokon.domain.AgricultureIncome;
import com.rokon.domain.calUtils;

public interface AgricultureIncomeService {
	public void add(AgricultureIncome agricultureIncome);

	public calUtils calculateValue(int id);
}
