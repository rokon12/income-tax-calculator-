package com.rokon.dao;

import java.util.List;

import com.rokon.domain.BussiOrProff;

public interface BussiOrProffDao {

	public BussiOrProff getBussiOrProff(int id);

	public void saveBussiOrProff(BussiOrProff bussiOrProff);

	public List<BussiOrProff> bussiOrProffsList();
}
