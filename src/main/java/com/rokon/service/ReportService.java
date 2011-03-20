package com.rokon.service;

import com.rokon.domain.Report;
import com.rokon.domain.CalUtils;

public interface ReportService {
	public CalUtils calculateValue(int id);
	
	public Report generateReportData(int userId);
}
