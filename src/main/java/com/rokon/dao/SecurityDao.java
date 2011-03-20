package com.rokon.dao;

import java.util.List;

import com.rokon.domain.Security;

public interface SecurityDao {

	public Security getSecurity(int id);

	public void saveSecurity(Security security);

	public List<Security> listSecurities();

}
