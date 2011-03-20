package com.rokon.dao;

import java.util.List;

import com.rokon.domain.HouseProperty;

public interface HousePropertyDao {
	public HouseProperty getHouseProperty(int id);

	public void saveHouseProperty(HouseProperty houseProperty);

	public List<HouseProperty> HousePropertyList();
}
