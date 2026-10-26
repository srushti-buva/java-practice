package com.tka.logical;

public class Number_Outside_Range {
	public static void main(String[] args) {
		int number = 150;
		System.out.println(! (number >= 0 && number <= 100));
	}

}
