package com.hsbc;

public class Account {
	private long accountNo;
	private double accountBalance;
	private long ifsc;
	public Account(long accountNo, double accountBalance, long ifsc) {
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.ifsc = ifsc;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public long getIfsc() {
		return ifsc;
	}
	public void setIfsc(long ifsc) {
		this.ifsc = ifsc;
	}
	public void display() {
		System.out.println("AccountNo:"+accountNo+" Account Balance: "+accountBalance+" Ifsc Code: "+ifsc);;
	}
}
