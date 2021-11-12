package com.xworkz.constructorapp;

public class CameraUtil {
	public static void main(String[] args) {
		Camera camera = new Camera();

		camera.brand = "Canon";
		camera.price = 30999.00;
		camera.batteryType = "AA Rechargeable Battery";

		camera.cameraSpecification();
		camera.clickPhotos();
	}
}
