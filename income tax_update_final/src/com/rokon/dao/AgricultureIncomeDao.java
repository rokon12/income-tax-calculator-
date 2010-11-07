package com.rokon.dao;

import java.util.List;

import com.rokon.domain.AgricultureIncome;

public interface AgricultureIncomeDao {

	public AgricultureIncome getAgricultureIncome(int id);

	public void saveAgricultureIncome(AgricultureIncome agricultureIncome);

	public List<AgricultureIncome> agrList();
}
