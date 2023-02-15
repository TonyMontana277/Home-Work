package com.ua.robot.homework11;

public class Main {
	public static void main(String[] args) {
		Car car = new Car("You have no rights to change it", "bmw", 234, 3, 34);
		Truck truck = new Truck("You have no rights to change it" , 2223, "Volvo", 123, 432, 323);
		FamilyCar famcar = new FamilyCar("You have no rights to change it", "suzuki", 23, 45, 4);
		System.out.println(car);
		System.out.println(truck);
		System.out.println(famcar);
		System.out.println(car.returnType());
		System.out.println(truck.returnType());
		System.out.println(famcar.returnType());
	}
}
