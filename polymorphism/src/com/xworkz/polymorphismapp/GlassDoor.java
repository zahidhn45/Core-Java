package com.xworkz.polymorphismapp;

public class GlassDoor extends Door {
	String material;
	String type;

	public GlassDoor() {
		super();
		System.out.println("Sub class Glass Door object is created");
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void secureHouse() {
		super.secureHouse();
		System.out.println("Glass door security");
	}
}
