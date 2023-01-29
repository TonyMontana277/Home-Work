package com.ua.robot.homework6;

public class FibonacciNumber {

	public static void main(String[] args) {
		int number1 = 0, number2 = 1, result = 0;
		System.out.println(Integer.toString(number1) + "\n" +  Integer.toString(number2));
		while (result < 100) {
			result = number1 + number2;
			if(result>100) {
				break;
			}
			System.out.println(result);
			number1 = number2;
			number2 = result;
		}

	}

}
