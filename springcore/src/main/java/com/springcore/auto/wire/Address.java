package com.springcore.auto.wire;

public class Address {
	
	private String name;
	
	private String age;
	
	private String Street;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	@Override
	public String toString() {
		return "Address [name=" + name + ", age=" + age + ", Street=" + Street + "]";
	}
	
	

}
