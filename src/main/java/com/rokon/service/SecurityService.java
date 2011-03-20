package com.rokon.service;

import com.rokon.domain.Security;
import com.rokon.domain.CalUtils;

public interface SecurityService {
	public void add(Security security);

	public CalUtils calculateValue(int id);
}
