package com.tka.logical;

public class All_Logical_Operator {
	public static void main(String[] args) {
		int age = 22;
		boolean hasId = true;
		boolean blocked = false;
		System.out.println( age >= 18 && hasId);
		System.out.println(age < 18 || blocked);
		System.out.println(!blocked);
	}

}
