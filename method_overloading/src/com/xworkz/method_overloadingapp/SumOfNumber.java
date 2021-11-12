package com.xworkz.method_overloadingapp;

public class SumOfNumber {
	public static int sum(int a, int b) {
		return a + b;
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println(sum(a, b));
		System.out.println(sum(a, b, c));
	}
}
