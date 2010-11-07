package com.rokon.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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

	public void setSpacialpay(String spacialpay) {
		this.spacialpay = spacialpay;
	}

	public String getSpacialpay() {
		return spacialpay;
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

	public String getMediall() {
		return mediall;
	}

	public void setMediall(String mediall) {
		this.mediall = mediall;
	}

	public void setExpendmed(String expendmed) {
		this.expendmed = expendmed;
	}

	public String getExpendmed() {
		return expendmed;
	}

	public String getSerall() {
		return serall;
	}

	public void setSerall(String serall) {
		this.serall = serall;
	}

	public String getLeaveall() {
		return leaveall;
	}

	public void setLeaveall(String leaveall) {
		this.leaveall = leaveall;
	}

	public String getHonorium() {
		return honorium;
	}

	public void setHonorium(String honorium) {
		this.honorium = honorium;
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

	public String getPrvidentaccrud() {
		return prvidentaccrud;
	}

	public void setPrvidentaccrud(String prvidentaccrud) {
		this.prvidentaccrud = prvidentaccrud;
	}

	public String getTrancfacility() {
		return trancfacility;
	}

	public void setTrancfacility(String trancfacility) {
		this.trancfacility = trancfacility;
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
	private String basicpay;
	private String spacialpay;
	private String dearall; // dearness allowance
	private String convyall; // conveyance allowance
	private String houserent; // house rent
	private String mediall; // medical allowance
	private String expendmed;
	private String serall; // servent allowance
	private String leaveall; // leave allownace
	private String honorium; // Honorarium/Reward/Fee
	private String overtime; // over time allowance
	private String entertainment;// Other allowance (Entertainment)
	private String bonus; // Bonus/Ex-gratia
	private String providentcontri; // Employer's Contribution to Recognized
	// Provident
	// Fund
	private String prvidentaccrud; // Interest accrued on Recognized Provident
	// Fund
	private String trancfacility; // Deemed income for transport facility
	private String others; // other income if any
}