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
	
	static void printSymbol(int HowMuchTimes, String symbol) {
		for (int i = 0; i < HowMuchTimes; i++ ) {
			System.out.print(symbol);
		}
	}
}
