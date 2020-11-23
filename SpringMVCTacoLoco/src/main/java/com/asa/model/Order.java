package com.asa.model;

public class Order{
	private String name;
	private int veggieTacoQty;
	private int beefTacoQty;
	private int chickenTacoQty;
	private int chorizoTacoQty;
	
	private double orderTotalCost;
	
	public Order() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVeggieTacoQty() {
		return veggieTacoQty;
	}
	public void setVeggieTacoQty(int veggieTacoQty) {
		this.veggieTacoQty = veggieTacoQty;
	}
	public int getBeefTacoQty() {
		return beefTacoQty;
	}
	public void setBeefTacoQty(int beefTacoQty) {
		this.beefTacoQty = beefTacoQty;
	}
	public int getChickenTacoQty() {
		return chickenTacoQty;
	}
	public void setChickenTacoQty(int chickenTacoQty) {
		this.chickenTacoQty = chickenTacoQty;
	}
	public int getChorizoTacoQty() {
		return chorizoTacoQty;
	}
	public void setChorizoTacoQty(int chorizoTacoQty) {
		this.chorizoTacoQty = chorizoTacoQty;
	}

	public double getOrderTotalCost() {
		return orderTotalCost;
	}

	public void setOrderTotalCost(double orderTotalCost) {
		this.orderTotalCost = orderTotalCost;
	}

	@Override
	public String toString() {
		return "Order [name=" + name + ", veggieTacoQty=" + veggieTacoQty + ", beefTacoQty=" + beefTacoQty
				+ ", chickenTacoQty=" + chickenTacoQty + ", chorizoTacoQty=" + chorizoTacoQty + ", orderTotalCost="
				+ orderTotalCost + "]";
	}
	
	
	
}