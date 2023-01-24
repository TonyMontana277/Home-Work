package com.ua.robot.homework5;
import java.util.*;
public class IsNumberEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int number1 = sc.nextInt();
		if(number1 % 2 == 0) {
			System.out.println(number1 + " is even");
		}
		else {
			System.out.println(number1 + " is odd");
		}

	}

}
