package com.springcore.ref;

public class Address {
	
	private String name;
	
	private int age;
	
	private String street;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Address(String name, int age, String street) {
		super();
		this.name = name;
		this.age = age;
		this.street = street;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [name=" + name + ", age=" + age + ", street=" + street + "]";
	}
	
	

}
