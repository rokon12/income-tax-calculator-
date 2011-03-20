package com.rokon.service;

import com.rokon.domain.HouseProperty;

public class GetHousePropertyImpl implements GetHouseProperty {

	@Override
	public void add(HouseProperty houseProperty) {
		System.out.println("House Property added successfully");
	}
}
