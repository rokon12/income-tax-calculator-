package com.rokon.dao;

import java.util.List;

import com.rokon.domain.CapitalGainBusiOther;

public interface CapitalGainBusiOtherDao {

	public CapitalGainBusiOther getCapitalGainBusiOther(int id);

	public void saveCapitalGainBusiOther(
			CapitalGainBusiOther capitalGainBusiOther);

	public List<CapitalGainBusiOther> cGainBusiOthersList();
}
