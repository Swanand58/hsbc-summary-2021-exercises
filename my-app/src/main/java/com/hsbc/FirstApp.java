package com.hsbc;

import java.util.Scanner;

public class FirstApp {

	public static void main(String[] args) {
		System.out.println("Enter any Character");
		Scanner sc = new Scanner(System.in);
		char character = sc.next().charAt(0);
		checkChar(character);
		sc.close();
	}
	public static void checkChar(char character) {
		int code = character;
		if(code >=97 && code <= 122) {
			System.out.println(character+" is an alphabet");
		}
		else if(code >=65 && code <= 90) {
			System.out.println(character+" is an alphabet");
		}
		else {
			System.out.println(character+" is not an alphabet");
		}
	}

}
