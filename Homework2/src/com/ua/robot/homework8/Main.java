package com.ua.robot.homework8;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] marks = new int [10];
		for (int i = 0; i < marks.length; i++) {
			marks[i] = ((int) (Math.random()*25));
		}
		int sum = 0;
		for(int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}
		
		System.out.println("Array:\t" + Arrays.toString(marks));
		Arrays.sort(marks);
		System.out.println("\nMin number is: " + marks[0]);
		System.out.println("\nMax number is: " + marks[9]);
		System.out.println("\nAverange number is: " + (double) sum/10);
		System.out.println("\nSum numbers is: " + sum);
		
		

	}

}
