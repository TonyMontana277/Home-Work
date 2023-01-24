package com.ua.robot.homework5;
import java.util.*;

public class MinNumber {

	public static void main(String[] args) {
		//take input from user
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter first number: ");
				int number1 = sc.nextInt();
				
				Scanner sc2 = new Scanner(System.in);
				System.out.print("Enter second number: ");
				int number2 = sc2.nextInt();
				System.out.print("Min number is: " + Math.min(number1, number2));

	}

}
