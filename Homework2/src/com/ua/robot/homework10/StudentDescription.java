package com.ua.robot.homework10;

public class StudentDescription {
	private String name;
	private int age;
	private int groupe;
	private int grade;
	private int payment; 
	


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



	public int getGroupe() {
		return groupe;
	}



	public void setGroupe(int groupe) {
		this.groupe = groupe;
	}



	public int getGrade() {
		return grade;
	}



	public void setGrade(int grade) {
		this.grade = grade;
	}



	public int getPayment() {
		return payment;
	}



	public void setPayment(int payment) {
		this.payment = payment;
	}

	


	public StudentDescription() {
		super();
	}



	public StudentDescription(String name, int age, int groupe, int grade, int payment) {
		super();
		this.name = name;
		this.age = age;
		this.groupe = groupe;
		this.grade = grade;
		this.payment = payment;
	}



	@Override
	public String toString() {
		return "StudentDescription [name=" + name + ", age=" + age + ", groupe=" + groupe + ", grade=" + grade
				+ ", payment=" + payment + "]";
	}
	
	
}
