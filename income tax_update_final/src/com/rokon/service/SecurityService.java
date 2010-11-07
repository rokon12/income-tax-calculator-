package com.rokon.service;

import com.rokon.domain.Security;
import com.rokon.domain.calUtils;

public interface SecurityService {
	public void add(Security security);

	public calUtils calculateValue(int id);
}
