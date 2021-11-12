package com.xworkz.constructor_chainingapp;

public class BodySprayUtil {
	public static void main(String[] args) {
		BodySpray bodySpray = new BodySpray(240, "Body Spray", true);
		System.out.println(bodySpray.brand + ", " + bodySpray.idelFor + ", " + bodySpray.quantityInML + ", "
				+ bodySpray.type + ", " + bodySpray.antiPerspirant);

	}
}
