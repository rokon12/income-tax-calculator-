package com.rokon.service;

import com.rokon.domain.BusinessOrProfessional;
import com.rokon.domain.CalUtils;

public interface BusinessOrProfessionalService {
	public void add(BusinessOrProfessional businessOrProfessional);

	public CalUtils calculateValue(int id);
}
