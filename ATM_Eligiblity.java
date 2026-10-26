package com.tka.logical;

public class ATM_Eligiblity {
	public static void main(String[] args) {
		double balance = 5000;
		double amount = 2000;
		System.out.println( amount > 0 && amount <= balance);
	}

}
