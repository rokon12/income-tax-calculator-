package com.rokon.service;

import com.rokon.dao.BusinessOrProfessionalDao;
import com.rokon.domain.BusinessOrProfessional;
import com.rokon.domain.CalUtils;

public class BusinessOrProfessionalServiceImpl implements BusinessOrProfessionalService {

	BusinessOrProfessionalDao businessOrProfessionalDao;

	public void setBusinessOrProfessionalDao(BusinessOrProfessionalDao businessOrProfessionalDao) {
		this.businessOrProfessionalDao = businessOrProfessionalDao;
	}

	@Override
	public void add(BusinessOrProfessional businessOrProfessional) {
		if (businessOrProfessional != null) {
			businessOrProfessionalDao.saveBusinessOrProfessional(businessOrProfessional);
			System.out.println("BusinessOrProfessionalService added.");
		}
	}

	@Override
	public CalUtils calculateValue(int id) {

		return null;
	}

}
