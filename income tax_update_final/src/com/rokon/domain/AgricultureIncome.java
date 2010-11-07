package com.rokon.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AgricultureIncome {

	@Id
	@GeneratedValue
	private int id;
	private String total_amount_of_land;
	private String production_per_unit;
	private String market_prize_per_crops;
	private String production_cost;

	public String getTotal_amount_of_land() {
		return total_amount_of_land;
	}

	public void setTotal_amount_of_land(String totalAmountOfLand) {
		total_amount_of_land = totalAmountOfLand;
	}

	public String getProduction_per_unit() {
		return production_per_unit;
	}

	public void setProduction_per_unit(String productionPerUnit) {
		production_per_unit = productionPerUnit;
	}

	public String getMarket_prize_per_crops() {
		return market_prize_per_crops;
	}

	public void setMarket_prize_per_crops(String marketPrizePerCrops) {
		market_prize_per_crops = marketPrizePerCrops;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setProduction_cost(String production_cost) {
		this.production_cost = production_cost;
	}

	public String getProduction_cost() {
		return production_cost;
	}
}
