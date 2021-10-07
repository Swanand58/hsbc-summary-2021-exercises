package com.hsbc;

public class SelectShape {

	public static void main(String[] args) {
		System.out.println("Circle Instance");
		Circle cl = new Circle();
		FindArea.printArea(cl, 10);
		System.out.println("Sphere Instance");
		Sphere sp = new Sphere();
		FindArea.printArea(sp, 10);
	}

}
