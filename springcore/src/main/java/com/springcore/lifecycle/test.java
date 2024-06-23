package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext nik = new ClassPathXmlApplicationContext("com/springcore/lifecycle/configlifecycle.xml");
	
		Samosa temp = (Samosa) nik.getBean("s1");
		System.out.println(temp.getPrice());
		System.out.println(temp.getClass().getName());
		nik.registerShutdownHook();
		
		System.out.println("___________________________________________");
		
		Pepsi pepsi = (Pepsi)nik.getBean("pepsi");
		System.out.println(pepsi.getPrice());
	
		System.out.println("_______________________________________________");
		
		Example example = (Example) nik.getBean("example");
		System.out.println(example.getSub());
	
	
		
	}

}
