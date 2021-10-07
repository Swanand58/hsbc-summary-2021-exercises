package com.hsbc;

public class Circle implements Shape{

	@Override
	public String area(int radius) {
		System.out.println("pi * radius * radius");
		return "pi * radius * radius";
	}

}
