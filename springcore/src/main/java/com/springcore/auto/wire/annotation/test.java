package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext nik = new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/autoconfigann.xml");
		Emp temp = (Emp)nik.getBean("emp");
		System.out.println(temp);
		
	
	}

}
