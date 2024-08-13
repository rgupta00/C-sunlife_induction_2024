package com.sunlife.employeemgtsytem;

public class PaymentProcessingSytem {

	public static void processPayment(Payable payable) {
		//open a jdbc conn
		double amount = payable.payable();
		System.out.println("payable amount is: "+ amount);
		//put in db
	}
}
