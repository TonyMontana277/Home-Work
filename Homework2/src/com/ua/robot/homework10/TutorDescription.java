package com.ua.robot.homework10;

public class TutorDescription {
	private String name;
	private int age;
	private String language;
	private int salary;
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
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public TutorDescription() {
		super();
	}
	public TutorDescription(String name, int age, String language, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.language = language;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "TutorDescription [name=" + name + ", age=" + age + ", language=" + language + ", salary=" + salary
				+ "]";
	}
	
	
}
