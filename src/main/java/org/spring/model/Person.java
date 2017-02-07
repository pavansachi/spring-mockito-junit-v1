package org.spring.model;

public class Person {

	public Person() {
		
	}
	
	public Person(final String name, final int age) {
		this.name = name;
		this.age = age;
	}
	
	private String name;
	private int age;
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
}