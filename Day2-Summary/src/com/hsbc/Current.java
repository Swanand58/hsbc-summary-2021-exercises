package com.hsbc;

public class Current extends Account{
	
	private String nomineeName;
	public Current(long accountNo, double accountBalance, long ifsc, String nomineeName) {
		
		super(accountNo, accountBalance, ifsc);
		this.nomineeName = nomineeName;
	}
	public String getNomineeName() {
		return nomineeName;
	}
	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}
	public void display() {
		System.out.println("AccountNo:"+getAccountNo()+" Account Balance: "+getAccountBalance()+" Ifsc:"+getIfsc()+" NomineeName: "+nomineeName);
	}

}
