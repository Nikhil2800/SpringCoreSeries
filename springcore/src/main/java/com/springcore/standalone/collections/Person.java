package com.springcore.standalone.collections;

import java.util.*;
import java.util.Set;

public class Person {
	
	private String name;
	
	private List<String> phones;
	
	private Set<String> friends;
	
	private Map<String,Integer> courses;
	
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", phones=" + phones + ", friends=" + friends + ", courses=" + courses
				+ ", properties=" + properties + "]";
	}
	
	

}
