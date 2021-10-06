package com.hsbc;

public class AccountImpl {

	public static void main(String[] args) {
		Account account = new Account(1000239, 500000.00, 12322);
		Savings savings = new Savings(1022365, 40000, 12322, 10000);
		Current current = new Current(1254985, 61000, 21265, "Alex");
		displayTest(account);
		displayTest(savings);
		displayTest(current);
	}
	public static void displayTest(Account a) {
		a.display();
	}

}
