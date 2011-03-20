package com.rokon.dao;

import java.util.List;

import com.rokon.domain.Salary;

public interface SalaryDao {
	public Salary getSalary(int id);

	public void saveSalary(Salary salary);

	public List<Salary> listSalaries();
}
