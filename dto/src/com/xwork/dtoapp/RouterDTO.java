package com.xwork.dtoapp;

public class RouterDTO {
	private int routerId;
	private String routerName;
	private String color;
	private double price;

	public RouterDTO(int routerId, String routerName, String color, double price) {
		super();
		this.routerId = routerId;
		this.routerName = routerName;
		this.color = color;
		this.price = price;
	}

	public int getRouterId() {
		return routerId;
	}

	public void setRouterId(int routerId) {
		this.routerId = routerId;
	}

	public String getRouterName() {
		return routerName;
	}

	public void setRouterName(String routerName) {
		this.routerName = routerName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
