package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext nik = new AnnotationConfigApplicationContext(javaconfig.class);
		Student temp = (Student)nik.getBean("Nikhil");
		System.out.println(temp);
		temp.study();

	}

}
