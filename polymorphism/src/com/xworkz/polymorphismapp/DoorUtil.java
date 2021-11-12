package com.xworkz.polymorphismapp;

public class DoorUtil {
	public static void main(String[] args) {
		Door door = new GlassDoor(); // Polymorphism
		door.setMaterials("Wood, Glass, Steel");
		door.setDurablity("High Durablity");
		door.secureHouse();

		GlassDoor glass = new GlassDoor(); // normal object
		glass.setMaterial("Glass");
		glass.setType("Front Gate");

		System.out.println("Door Material: " + door.materials + ", Duriablity: " + door.durablity
				+ ", Our Door material: " + glass.material + ", Type: " + glass.type);
	}
}
