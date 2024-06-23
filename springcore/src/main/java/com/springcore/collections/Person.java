package com.springcore.collections;

import java.util.*;

public class Person {
	private String name;
	
	private List<String> phones;
	
	private Set<String> friends;
	
	private Map<String, Integer> courses;
	
	private Properties properties;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Person(String name, List<String> phones, Set<String> friends, Map<String, Integer> courses,
			Properties properties) {
		super();
		this.name = name;
		this.phones = phones;
		this.friends = friends;
		this.courses = courses;
		this.properties = properties;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
