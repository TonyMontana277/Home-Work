package com.ua.robot.homework11;

public class FamilyCar extends Car {
	
	private String type = "family car";	//I want this Class type constant 

	public FamilyCar() {
		super();
		
	}

	public FamilyCar(String type, String model, int weight, int year, int horsePower) {
		super(type, model, weight, year, horsePower);
		
	}

		//override return car type
		String returnType() {
			return type  = "family car";
		}

		@Override
		public String toString() {
			return "FamilyCar [type=" + type + ", model=" + model + ", weight=" + weight + ", year=" + year
					+ ", horsePower=" + horsePower + "]";
		}

}
