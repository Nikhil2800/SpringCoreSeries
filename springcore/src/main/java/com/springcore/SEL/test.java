package com.springcore.SEL;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;



public class test {

	public static void main(String[] args) {

		ApplicationContext nik = new ClassPathXmlApplicationContext("com/springcore/SEL/SELconfig.xml");
		Demo temp = (Demo) nik.getBean("demo");
		
		System.out.println(temp);
	}

}
