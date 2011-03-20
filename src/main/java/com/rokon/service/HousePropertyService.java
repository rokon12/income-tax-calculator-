package com.rokon.service;

import com.rokon.domain.HouseProperty;
import com.rokon.domain.CalUtils;

public interface HousePropertyService {
	public void add(HouseProperty houseProperty);

	public CalUtils calculatValue(int id);
}
