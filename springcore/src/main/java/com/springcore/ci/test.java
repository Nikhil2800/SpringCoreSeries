package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext nik = new ClassPathXmlApplicationContext("com/springcore/ci/configci.xml");
		
		Person temp = (Person) nik.getBean("person");
		System.out.println(temp);
		
		System.out.println("_____________________________________________");
		
		Addition temp1 =(Addition)nik.getBean("add");
		System.out.println(temp1);
		temp1.Dosum();
	}

}
