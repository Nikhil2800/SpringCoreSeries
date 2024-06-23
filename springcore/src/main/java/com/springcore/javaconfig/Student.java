package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Student {
	
	@Autowired
	private Samosa samosa;
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public void study() {
		this.samosa.factorial(5);
		System.out.println("student is studying...");
	}
	
	

}
