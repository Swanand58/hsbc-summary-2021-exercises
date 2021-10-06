package com.hsbc;

public class Person {
	private String name;
	private String gender;
	private String emailId;
	private long phone;
	
	public Person(String name, String gender){
		this.name = name;
		this.gender = gender;
	}
	public Person(String name, String gender, String emailId){
		this(name, gender);
		this.emailId = emailId;
	}
	public Person(String name, String gender, String emailId, long phone){
		this(name, gender, emailId);
		this.phone = phone;
	}

	public static void main(String[] args) {
		Person p1 = new Person("Alex", "male");
		Person p2 = new Person("Bruce", "male", "bruce@gmail.com");
		Person p3 = new Person("Charles", "male", "charles@gmail.com", 2938420);
		
		System.out.println(p1.name+" "+p1.gender+" "+p1.emailId+" "+p1.phone);
		System.out.println(p2.name+" "+p2.gender+" "+p2.emailId+" "+p2.phone);
		System.out.println(p3.name+" "+p3.gender+" "+p3.emailId+" "+p3.phone);
	}

}
