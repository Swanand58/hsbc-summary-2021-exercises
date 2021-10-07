package com.hsbc;

public class SelectVehicle {
	public static void main(String[] args) {
		System.out.println("KTM instance");
		KTM ktm = new KTM();
		UI.printVehicle(ktm);
		System.out.println("Royal Enfield instance");
		RoyalEnfield rf = new RoyalEnfield();
		UI.printVehicle(rf);
		System.out.println("Alto instance");
		Alto at = new Alto();
		UI.printVehicle(at);
		System.out.println("Skoda instance");
		Skoda sd = new Skoda();
		UI.printVehicle(sd);
		System.out.println("BMW instance");
		BMW bmw = new BMW();
		UI.printVehicle(bmw);
		
		
	}
}
