package com.ua.robot.homework12;

public class Parent {
	protected int age;
	static{
		System.out.println(1);
	}
	
	{
		System.out.println(3);
	}

	public Parent() {
		super();
		System.out.println(4);
	}

	public Parent(int age) {
		super();
		this.age = age;
		System.out.println(4);
	}
	
	
	
}
