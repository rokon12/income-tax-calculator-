package com.rokon.service;

import com.rokon.domain.BussiOrProff;
import com.rokon.domain.calUtils;

public interface BussiOrProffService {
	public void add(BussiOrProff bussiOrProff);

	public calUtils calculateValue(int id);
}
