package com.ua.robot.homework12;

public class Child extends Parent {
	static{
		System.out.println(2);
	}
	
	{
		System.out.println(5);
	}

	public Child() {
		super();
		System.out.println(6);
	}

	public Child(int age) {
		super(age);
		System.out.println(6);
	}
	
	
}
