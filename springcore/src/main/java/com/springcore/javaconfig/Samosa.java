package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

//@Component
public class Samosa {
	
	public void factorial(int n) {
		int i=1;
		int fac=1;
		while(i<=n) {
			fac=fac*i;
			i++;
		}
		System.out.println("factorial is "+fac);
	}

}
