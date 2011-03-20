package com.rokon.service;

import com.rokon.domain.Salary;

public class GetSalaryImpl implements GetSalary {

	@Override
	public void add(Salary salary) {
		System.out.println("Salary added successfully");
	}
}
