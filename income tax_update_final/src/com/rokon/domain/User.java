package com.rokon.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	private int id;
	/* 01 */private String name;
	/* 02 */private String nationalid;
	/* 03 */private String circle;
	/* 04 */private String taxeszone;
	/* 05 */private String asssessment;
	/* 06 */private String residentialstatus;
	/* 07 */private String status;
	/* 08 */private String nameoftheemployer;
	/* 09 */private String wiferrhusbandsname;
	/* 10 */private String fathersname;
	/* 11 */private String mothersname;
	/* 12 */private String dateofbirth;
	/* 13 */private String presentaddress;
	/* 14 */private String paradd;
	/* 15 */private String telephoneno;
	/* 16 */private String vatreginumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(nullable = true, unique = true)
	public String getNationalid() {
		return nationalid;
	}

	public void setNationalid(String nationalid) {
		this.nationalid = nationalid;
	}

	public String getCircle() {
		return circle;
	}

	public void setCircle(String circle) {
		this.circle = circle;
	}

	public String getTaxeszone() {
		return taxeszone;
	}

	public void setTaxeszone(String taxeszone) {
		this.taxeszone = taxeszone;
	}

	public String getResidentialstatus() {
		return residentialstatus;
	}

	public void setResidentialstatus(String residentialstatus) {
		this.residentialstatus = residentialstatus;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNameoftheemployer() {
		return nameoftheemployer;
	}

	public void setNameoftheemployer(String nameoftheemployer) {
		this.nameoftheemployer = nameoftheemployer;
	}

	public String getWiferrhusbandsname() {
		return wiferrhusbandsname;
	}

	public void setWiferrhusbandsname(String wiferrhusbandsname) {
		this.wiferrhusbandsname = wiferrhusbandsname;
	}

	public String getFathersname() {
		return fathersname;
	}

	public void setFathersname(String fathersname) {
		this.fathersname = fathersname;
	}

	public String getMothersname() {
		return mothersname;
	}

	public void setMothersname(String mothersname) {
		this.mothersname = mothersname;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getPresentaddress() {
		return presentaddress;
	}

	public void setPresentaddress(String presentaddress) {
		this.presentaddress = presentaddress;
	}

	public String getTelephoneno() {
		return telephoneno;
	}

	public void setTelephoneno(String telephoneno) {
		this.telephoneno = telephoneno;
	}

	public String getVatreginumber() {
		return vatreginumber;
	}

	public void setVatreginumber(String vatreginumber) {
		this.vatreginumber = vatreginumber;
	}

	public void setAsssessment(String asssessment) {
		this.asssessment = asssessment;
	}

	public String getAsssessment() {
		return asssessment;
	}

	public void setParadd(String paradd) {
		this.paradd = paradd;
	}

	public String getParadd() {
		return paradd;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

}
