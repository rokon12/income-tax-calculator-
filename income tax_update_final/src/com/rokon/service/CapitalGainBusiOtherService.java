package com.rokon.service;

import com.rokon.domain.CapitalGainBusiOther;
import com.rokon.domain.calUtils;

public interface CapitalGainBusiOtherService {
	public void add(CapitalGainBusiOther capitalGainBusiOther);

	public calUtils calculateValue(int id);
}
