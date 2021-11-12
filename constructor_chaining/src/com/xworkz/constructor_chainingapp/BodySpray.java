package com.xworkz.constructor_chainingapp;

public class BodySpray {
	String brand;
	String idelFor;
	int quantityInML;
	String type;
	boolean antiPerspirant;

	public BodySpray() {
		System.out.println("Default constructor is called");
	}

	public BodySpray(String brand, String idelFor) {
		this();
		System.out.println("2nd constructor is called");
		this.brand = brand;
		this.idelFor = idelFor;
	}

	public BodySpray(int quantityInML, String type, boolean antiPerspirant) {
		this("Fogg", "Men");
		System.out.println("3rd constructor is called");
		this.quantityInML = quantityInML;
		this.type = type;
		this.antiPerspirant = antiPerspirant;
	}
}
