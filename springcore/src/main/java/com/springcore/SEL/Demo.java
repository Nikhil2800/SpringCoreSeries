package com.springcore.SEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{55+55}")
	private int a;
	
	@Value("#{5*5}")
	private int b;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double c;
	
	@Value("#{T(java.lang.Math).PI}")
	private double d;
	
	@Value("#{T(java.lang.Math).E}")
	private double e;
	
	@Value("#{new java.lang.String('Nikhil Shinde')}")
	private String name;
	
	@Value("#{8>5}")
	private boolean isActive;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Demo [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", e=" + e + ", name=" + name + ", isActive="
				+ isActive + "]";
	}
	
	

}
