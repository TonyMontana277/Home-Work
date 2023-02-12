package com.ua.robot.homework10;

public class Main {

	public static void main(String[] args) {
		//tutor
		TutorDescription tutor1 = new TutorDescription();
		tutor1.setName("Tony_Montana");
		tutor1.setAge(21);
		tutor1.setLanguage("English");
		tutor1.setSalary(2300);
		System.out.println(tutor1);
		
		//student
		StudentDescription student = new StudentDescription("Bilbo Baggins", 45, 3, 6, 1342);
		System.out.println(student);
		
		//random array
		Array newArr = new Array();
		int[] arr = newArr.getRandomNumbersArray(11);
		newArr.printArray(arr);//print random array
		
		int[] arrToHigh = newArr.arraySortByHeight(arr);
		System.out.print("\n");
		newArr.printArray(arrToHigh);//print sorted array from low to high
		
		int[] arrToLow = newArr.arraySortByRecession(arr);
		System.out.print("\n");
		newArr.printArray(arrToLow);//print sorted array from high to low
	}

}
