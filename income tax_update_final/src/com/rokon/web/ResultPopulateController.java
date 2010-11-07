package com.rokon.web;

import java.sql.Date;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.rokon.domain.Report;
import com.rokon.domain.Salary;
import com.rokon.domain.User;
import com.rokon.service.ReportService;

public class ResultPopulateController extends AbstractController {

	ReportService reportService;

	public void setReportService(ReportService reportService) {
		this.reportService = reportService;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Map<String, Object> model = new HashMap<String, Object>();

		// Report report = new Report();
		// report.setUser();

		// report = reportService.generateReportData(4);
		Format formatter;
		formatter = new SimpleDateFormat("dd-MMM-yy");
		java.util.Date date = new java.util.Date();
		String dateString = formatter.format(date);

		Report report = new Report();
		User user = new User();
		user.setName("Bazlur Rahman Rokon");
		user.setAsssessment("jokes");
		user.setCircle("Dhaka");
		user.setDateofbirth("12/10/2013");
		user.setCircle("Dhaka");
		user.setFathersname("asdfas");
		user.setMothersname("asdfasd");
		user.setNameoftheemployer("sadfas");
		user.setNationalid("asdfasd");
		user.setParadd("asdfsda");
		user.setPresentaddress("sadfasdf");
		user.setResidentialstatus("asdfasdf");
		user.setStatus("asdfasdf");
		user.setTaxeszone("asdfasd");
		user.setTaxeszone("asdfasd");
		user.setVatreginumber("asdfasd");
		user.setWiferrhusbandsname("asdfasdmr ");

		report.setUser(user);

		Salary salary = new Salary();
		salary.setBasicpay("45000");
		salary.setBonus("10000");
		salary.setConvyall("5000");
		salary.setDearall("2000");
		salary.setEntertainment("3000");
		salary.setExpendmed("10000");
		salary.setHonorium("7000");
		salary.setHouserent("2000");
		salary.setHonorium("10000");
		salary.setHouserent("190000");
		salary.setId(1);
		salary.setLeaveall("20000");
		salary.setMediall("210000");
		salary.setOthers("3000");
		salary.setOvertime("200");
		salary.setProvidentcontri("25234");
		salary.setPrvidentaccrud("23423");
		salary.setSpacialpay("23423");
		salary.setTrancfacility("23423");

		report.setSalary(salary);

		// report.setUser(user);
		model.put("report", report);
		model.put("date", dateString);
		
		return new ModelAndView("showResult", model);
	}
}
