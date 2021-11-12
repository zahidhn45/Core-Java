package com.xwork.dtoapp;

public class RouterUtil {

	public static void main(String[] args) {
		RouterDTO dto = new RouterDTO(1, "D-Link", "White", 250.00);
		System.out.println(
				dto.getRouterId() + ", " + dto.getRouterName() + ", " + dto.getColor() + ", " + dto.getPrice());

	}
}
