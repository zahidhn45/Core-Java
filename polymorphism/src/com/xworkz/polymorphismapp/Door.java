package com.xworkz.polymorphismapp;

public class Door {
	String materials;
	String durablity;

	public Door() {
		super();
		System.out.println("Super class door is created");
	}

	public String getMaterials() {
		return materials;
	}

	public void setMaterials(String materials) {
		this.materials = materials;
	}

	public String getDurablity() {
		return durablity;
	}

	public void setDurablity(String durablity) {
		this.durablity = durablity;
	}

	public void secureHouse() {
		System.out.println("Security");
	}

}
