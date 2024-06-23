package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
	
	ApplicationContext nik = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereotypeconfig.xml");
		
	Student temp = (Student)nik.getBean("student");
	System.out.println(temp.getName());
	System.out.println(temp.getAge());
	System.out.println(temp.getStreet());
	
	System.out.println("_______________________________________________");
	
	System.out.println(temp.getPhones());
	System.out.println(temp.getPhones().getClass().getName());
	
	System.out.println("____________________________________________");
	
	System.out.println(temp.getFriends());
	System.out.println(temp.getFriends().getClass().getName());
	
	System.out.println("__________________________________________________");
	
	System.out.println(temp.getCourses());
	System.out.println(temp.getCourses().getClass().getName());
	
	System.out.println("___________________________________________________");
	System.out.println(temp.getProperties());
	System.out.println(temp.getProperties().getClass().getName());
	
	System.out.println("____________________________________________________");
	
	teacher temp1 = (teacher) nik.getBean("teacher");
	
	teacher temp2 = (teacher) nik.getBean("teacher");
	
	System.out.println(temp1.hashCode());
	System.out.println(temp2.hashCode());

	
	

		
		
	}

}
