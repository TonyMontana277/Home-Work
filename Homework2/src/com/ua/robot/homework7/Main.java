package com.ua.robot.homework7;

public class Main {

	public static void main(String[] args) {
		int cube = getNumberCube(2);
		System.out.println(cube);
		
		printSymbol(2);
		printSymbol(3, "X");

	}
	static int getNumberCube(int number) { 
		return number * number * number;
	}
	
	static void printSymbol(int number) {
		for (int i = 0; i < number; i++ ) {
			System.out.print("*");
		}
	}
	
	static void printSymbol(int howMuchTimes, String symbol) {
		for (int i = 0; i < howMuchTimes; i++ ) {
			System.out.print(symbol);
		}
	}
}
