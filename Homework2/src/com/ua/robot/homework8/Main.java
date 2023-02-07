package com.ua.robot.homework8;

import java.util.Random;

public class Main {
		
		public static void main(String[] args) {
			int length = 10;
			int[] marks = new int[length];
			fillArrayWithRandomNumbers(marks, 30);
			printArray(marks);
			System.out.print("\nMax value is: " + maxValueArray(marks));
			System.out.print("\nMin value is: " + minValueArray(marks));
			System.out.print("\nSum value is: " + sumArray(marks));
			System.out.print("\nAverage value is: " + averageArray(marks));
		}
		
		static void fillArrayWithRandomNumbers(int[] arr, int maxValue) {
			Random random = new Random();
			for(int i = 0; i < arr.length; i++){
				arr[i] = random.nextInt(maxValue);
				}
			}
		
		static void printArray(int[] arr) {
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		}
		
		static int maxValueArray(int[] arr) {
			int max = arr[0];
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] > max) {
					max = arr[i];
				}
			}
			return max;	
			}
	
		static int minValueArray(int[] arr) {
			int min = arr[0];
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] < min) {
					min = arr[i];
				}
			}
			return min;	
			}
		
		static int sumArray(int[] arr) {
			int sum = 0;
			for(int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			return sum;
		}
		
		static double averageArray(int[] arr) {
			double average = 0;
			int sum = 0;
			for(int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			average = (double) sum / arr.length;
			return average;
		}
		
	}