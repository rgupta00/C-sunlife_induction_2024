package com.sunlife.employeemgtsytem;

public class Invoice implements Payable {

	private String regNo;
	private String name;
	private int noOfDays;
	private int ratePerDay;

	public Invoice(int id, String name, double amount, String regNo, int noOfDays, int ratePerDay) {
		//
		this.noOfDays = noOfDays;
		this.ratePerDay = ratePerDay;
	}

	@Override
	public double payable() {
		return noOfDays * ratePerDay * 0.7;
	}

}
