package com.ua.robot.homework4;

import java.util.*;

public class StringProgram {

	public static void main(String[] args) {
		//take input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string");
		String str = sc.nextLine();
		System.out.print("You have entered: " + str);
		
		int number = str.length();
		// if input empty
		if(number < 1) {
			System.out.println("There is no text! \nPrint smth!");
		}
		else {
			String strup = str.toUpperCase();
			String strlow = str.toLowerCase();
			char firstlitter = str.charAt(0);
			char lastlitter = str.charAt(number - 1);// -1 because count starts from 0
			System.out.println("\nString to upperCase: " + strup + "\nString to lowerCase: " + strlow + "\nFirst litter: " + firstlitter + "\nLast litter: " + lastlitter);
			
		}
		
	}

}
