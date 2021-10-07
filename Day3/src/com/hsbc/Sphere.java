package com.hsbc;

public class Sphere implements Shape{

	@Override
	public String area(int radius) {
		System.out.println("4 * pi * radius * radius");
		return "4 * pi * radius * radius";
	}

}
