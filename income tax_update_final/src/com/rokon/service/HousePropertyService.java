package com.rokon.service;

import com.rokon.domain.HouseProperty;
import com.rokon.domain.calUtils;

public interface HousePropertyService {
	public void add(HouseProperty houseProperty);

	public calUtils calculatValue(int id);
}
