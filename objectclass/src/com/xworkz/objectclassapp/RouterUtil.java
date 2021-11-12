package com.xworkz.objectclassapp;

public class RouterUtil {

	public static void main(String[] args) {
		Router router = new Router(1, "D-link", "White", "Plastic", true);
		Router router1 = new Router(1, "E-link", "Blue", "Plastic", false);

		System.out.println(router);
		System.out.println(router1);
		System.out.println(router.equals(router1));
		System.out.println();
	}

}
