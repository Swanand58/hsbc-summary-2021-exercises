package com.hsbc;

public class Savings extends Account{
	
	private double dailyLimit;
	
	public Savings(long accountNo, double accountBalance, long ifsc, double dailyLimit) {
		super(accountNo, accountBalance, ifsc);
		this.dailyLimit = dailyLimit;
	}

	public double getDailyLimit() {
		return dailyLimit;
	}

	public void setDailyLimit(double dailyLimit) {
		this.dailyLimit = dailyLimit;
	}
	 
	public void display() {
		System.out.println("AccountNo:"+getAccountNo()+" Account Balance: "+getAccountBalance()+" Ifsc:"+getIfsc()+" DailyLimit: "+dailyLimit);
	}
}
