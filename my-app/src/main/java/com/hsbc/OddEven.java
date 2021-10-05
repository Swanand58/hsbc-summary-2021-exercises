package com.hsbc;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		System.out.println("Please enter the first number:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Please enter the first number:");
		int b = sc.nextInt();
		checkEven(a, b);
		checkOdd(a, b);
		sc.close();

	}
	public static void checkEven(int a, int b) {
		System.out.println("In Even() ");
		for(int i = a; i <= b; i++) {
			if(i % 2 == 0) {
				
				System.out.println(i+" ");
			}
		}
	}
	public static void checkOdd(int a, int b) {
		System.out.println("In Odd() ");
		for(int i = a; i <= b; i++) {
			if(i % 2 != 0) {
				
				System.out.println(i+" ");
			}
		}
	}
}
