package com.springcore.ci;

public class Person {
	
	private String name;
	
	private int age;
	
	private String street;
	
	private Certi certi;

	public Person(String name, int age, String street, Certi certi) {
		super();
		this.name = name;
		this.age = age;
		this.street = street;
		this.certi = certi;
	}

	@Override
	public String toString() {
		
		return this.name+" \t "+this.age+" \t "+this.street+" \t "+this.certi.name;
	}
	
	

}
