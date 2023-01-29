package com.ua.robot.homework6;

public class FactorialProgram {

	public static void main(String[] args) {
		int i = 0;
		int fact = 1;
		while (i < 7) {
			i++;
			int result = i * fact;
			fact = result;
			
		}
		System.out.println(fact);
	}

}
