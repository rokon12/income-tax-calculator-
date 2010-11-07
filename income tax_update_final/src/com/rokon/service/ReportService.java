package com.rokon.service;

import com.rokon.domain.Report;
import com.rokon.domain.calUtils;

public interface ReportService {
	public calUtils calculateValue(int id);
	
	public Report generateReportData(int userId);
}
