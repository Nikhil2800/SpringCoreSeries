package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext nik = new ClassPathXmlApplicationContext("com/springcore/config.xml");
        Student temp = (Student)nik.getBean("student");
        System.out.println(temp);
        
        System.out.println("_____________________________________________");
        
        Student temp1 = (Student) nik.getBean("student1");
        System.out.println(temp1);
        

        
   
    }
}
