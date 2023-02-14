package com.ua.robot.homework10;

import java.util.Random;

public class Array {
	
	int[] getRandomNumbersArray(int size) {
		int[] arr = new int[size];
		Random random = new Random();
		for(int i = 0; i < size; i++ ) {
			arr[i] = random.nextInt(size);
			}
		return arr;
	}
	
	int[] arraySortByHeight(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int b = 0; b < arr.length - 1; b++) {
				if(arr[b] > arr[b+1]) {
					int replace = arr[b];
					arr[b] = arr[b+1];
					arr[b+1] = replace;
					}	
				}
			}
		return arr;
	}

	int[] arraySortByRecession(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int b = 0; b < arr.length - 1; b++) {
				if(arr[b] < arr[b+1]) {
					int replace = arr[b];
					arr[b] = arr[b+1];
					arr[b+1] = replace;
				}	
			}
		}
		return arr;
	}
	void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");}
	}
}
