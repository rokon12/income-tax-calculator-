package com.rokon.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class Salary {

	public void setId(int id) {
		this.id = id;
	}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public String getBasicpay() {
		return basicpay;
	}

	public void setSpecialpay(String specialpay) {
		this.specialpay = specialpay;
	}

	public String getSpecialpay() {
		return specialpay;
	}

	public void setBasicpay(String basicpay) {
		this.basicpay = basicpay;
	}

	public String getDearall() {
		return dearall;
	}

	public void setDearall(String dearall) {
		this.dearall = dearall;
	}

	public String getConvyall() {
		return convyall;
	}

	public void setConvyall(String convyall) {
		this.convyall = convyall;
	}

	public String getHouserent() {
		return houserent;
	}

	public void setHouserent(String houserent) {
		this.houserent = houserent;
	}

	public String getMedicall() {
		return medicall;
	}

	public void setMedicall(String medicall) {
		this.medicall = medicall;
	}

	public void setExpendmed(String expendmed) {
		this.expendmed = expendmed;
	}

	public String getExpendmed() {
		return expendmed;
	}

	public String getServantall() {
		return servantall;
	}

	public void setServantall(String servantall) {
		this.servantall = servantall;
	}

	public String getLeaveall() {
		return leaveall;
	}

	public void setLeaveall(String leaveall) {
		this.leaveall = leaveall;
	}

	public String getHonorarium() {
		return honorarium;
	}

	public void setHonorarium(String honorarium) {
		this.honorarium = honorarium;
	}

	public String getOvertime() {
		return overtime;
	}

	public void setOvertime(String overtime) {
		this.overtime = overtime;
	}

	public String getEntertainment() {
		return entertainment;
	}

	public void setEntertainment(String entertainment) {
		this.entertainment = entertainment;
	}

	public String getBonus() {
		return bonus;
	}

	public void setBonus(String bonus) {
		this.bonus = bonus;
	}

	public String getProvidentcontri() {
		return providentcontri;
	}

	public void setProvidentcontri(String providentcontri) {
		this.providentcontri = providentcontri;
	}

	public String getProvidentaccrued() {
		return providentaccrued;
	}

	public void setProvidentaccrued(String providentaccrued) {
		this.providentaccrued = providentaccrued;
	}

	public String getTransfacility() {
		return transfacility;
	}

	public void setTransfacility(String transfacility) {
		this.transfacility = transfacility;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}

	/******************************
	 * Salary.. 1. Basic Pay 2. Dearness Allowance 3. Conveyance allowance 4.
	 * House rent allowance 5. Medical allowance 6. Servant allowance 7. Leave
	 * allowance 8. Honorarium/Reward/Fee 9. Overtime allowance 10 .
	 * Bonus/Ex-gratia 11. Other allowance (Entertainment) 12. Employer's
	 * Contribution to Recognized Provident Fund 13. Interest accrued on
	 * Recognized Provident Fund 14. Deemed income for transport facility 15.
	 * Others, if any
	 * ************************************************************************
	 */
	// atributes

	private int id;
	
	@Column(name = "basic_pay")
	private String basicpay;
	
	@Column(name = "special_pay")
	private String specialpay;
	
	@Column(name = "dearness_allowance")
	private String dearall; // dearness allowance
	
	@Column(name = "conveyance_allowance")
	private String convyall; // conveyance allowance
	
	@Column(name = "house_rent")
	private String houserent; // house rent
	
	@Column(name = "medical_allowance")
	private String medicall; // medical allowance
	
	@Column(name = "expend_medical")
	private String expendmed;
	
	@Column(name = "servant_allowance")
	private String servantall; // servant allowance
	
	@Column(name = "leave_allowance")
	private String leaveall; // leave allowance
	
	@Column(name = "honorarium")
	private String honorarium; // Honorarium/Reward/Fee
	
	@Column(name = "overtime")
	private String overtime; // over time allowance
	
	@Column(name = "entertainment")
	private String entertainment;// Other allowance (Entertainment)
	
	@Column(name = "bonus")
	private String bonus; // Bonus/Ex-gratia
	
	@Column(name = "provident_contribution")
	private String providentcontri; // Employer's Contribution to Recognized
	// Provident
	// Fund
	
	@Column(name = "provident_accrued")
	private String providentaccrued; // Interest accrued on Recognized Provident
	// Fund
	
	@Column(name = "transport_facility")
	private String transfacility; // Deemed income for transport facility
	
	@Column(name = "others")
	private String others; // other income if any
}