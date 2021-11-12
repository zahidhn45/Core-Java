package com.xworkz.constructorapp;

public class Camera {
	String brand;
	double price;
	String batteryType;

	public Camera() {
		System.out.println("Default Constructor");
	}

	public void clickPhotos() {
		System.out.println("Clicking Photos");
	}

	public void cameraSpecification() {
		System.out.println(brand);
		System.out.println(price);
		System.out.println(batteryType);
	}
}
