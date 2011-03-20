package com.rokon.service;

import com.rokon.domain.CapitalGainBusiOther;
import com.rokon.domain.CalUtils;

public interface CapitalGainBusiOtherService {
	public void add(CapitalGainBusiOther capitalGainBusiOther);

	public CalUtils calculateValue(int id);
}
