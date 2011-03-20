package com.rokon.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AgricultureIncome {

	@Id
	@GeneratedValue
	private int id;
	@Column(name = "total_amount_of_land")
	private String totalAmountOfLand;
	
	@Column(name = "production_per_unit")
	private String productionPerUnit;
	
	@Column(name = "market_prize_per_crops")
	private String marketPricePerCrops;
	
	@Column(name = "production_cost")
	private String productionCost;

	public String getTotalAmountOfLand() {
		return totalAmountOfLand;
	}

	public void setTotalAmountOfLand(String totalAmountOfLand) {
		this.totalAmountOfLand = totalAmountOfLand;
	}

	public String getProductionPerUnit() {
		return productionPerUnit;
	}

	public void setProductionPerUnit(String productionPerUnit) {
		this.productionPerUnit = productionPerUnit;
	}

	public String getMarketPricePerCrops() {
		return marketPricePerCrops;
	}

	public void setMarketPricePerCrops(String marketPricePerCrops) {
		this.marketPricePerCrops = marketPricePerCrops;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getProductionCost() {
		return productionCost;
	}

	public void setProductionCost(String productionCost) {
		this.productionCost = productionCost;
	}
}
