package com.rokon.service;

import com.rokon.domain.Salary;
import com.rokon.domain.calUtils;

public interface SalaryService {
	public void add(Salary salary);

	public calUtils calculateValue(int id);
}
