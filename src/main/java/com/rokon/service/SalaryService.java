package com.rokon.service;

import com.rokon.domain.Salary;
import com.rokon.domain.CalUtils;

public interface SalaryService {
	public void add(Salary salary);

	public CalUtils calculateValue(int id);
}
