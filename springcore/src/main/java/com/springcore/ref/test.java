package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext nik = new  ClassPathXmlApplicationContext("com/springcore/ref/configref.xml");
		A a = (A) nik.getBean("aref");
		System.out.println(a.getX());
		System.out.println(a.getOb().getY());
		
		emp temp = (emp) nik.getBean("emp");
		System.out.println(temp.getAddress());
	
	}

}
