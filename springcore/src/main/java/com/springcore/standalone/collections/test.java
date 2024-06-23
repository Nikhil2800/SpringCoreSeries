package com.springcore.standalone.collections;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	
	public static void main(String[] args) {
		
		
		ApplicationContext nik = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
		Person temp = (Person)nik.getBean("person");
		System.out.println(temp.getName());
		
		System.out.println("_______________________________________");
		
		System.out.println(temp.getPhones());
		System.out.println(temp.getPhones().getClass().getName());
		
		System.out.println("______________________________________");
		
		System.out.println(temp.getFriends());
		System.out.println(temp.getFriends().getClass().getName());
		
		System.out.println("_____________________________________________");
		
		System.out.println(temp.getCourses());
		System.out.println(temp.getCourses().getClass().getName());
		
		System.out.println("___________________________________");
		
		System.out.println(temp.getProperties());
		System.out.println(temp.getProperties().getClass().getName());
		
		
	}

}
