package com.ua.robot.homework12;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child1 = new Child();
		System.out.println("Initialization by another constructor so we can see that static initializate only once");
		Child child2 = new Child(21);
	}

}
