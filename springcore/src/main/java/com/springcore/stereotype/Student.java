package com.springcore.stereotype;

import java.util.*;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("Nikhil Shinde")
	private String name;
	
	@Value("24")
	private int age;
	
	@Value("Ghatnandre")
	private String street;
	
	@Value("#{Nikhil}")
	private List<String> phones;
	
	@Value("#{Nikhil1}")
	private Set<String> friends;
	
	@Value("#{Nikhil2}")
	private Map<String, Integer> courses;
	
	@Value("#{Nikhil3}")
	private Properties properties;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getFriends() {
		return friends;
	}

	public void setFriends(Set<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, Integer> courses) {
		this.courses = courses;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", street=" + street + ", phones=" + phones + ", friends="
				+ friends + ", courses=" + courses + ", properties=" + properties + "]";
	}
	
	

}
