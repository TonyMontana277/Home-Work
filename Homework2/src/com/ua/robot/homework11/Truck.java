package com.ua.robot.homework11;

public class Truck extends Car{
	
	
	protected int cargo;
	private String type = "truck";//I want this Class type constant 
	
	
	public Truck() {
		super();
	}

	public Truck(String type, int cargo, String model, int weight, int year, int horsePower) {
		super(type, model, weight, year, horsePower);
		this.cargo = cargo;
		// TODO Auto-generated constructor stub
	}

	public int getCargo() {
		return cargo;
	}


	public void setCargo(int cargo) {
		this.cargo = cargo;
	}

	//override return car type
	String returnType() {
		return type  = "truck";
	}
	@Override
	public String toString() {
		return "Truck [type=" + type + ", cargo=" + cargo +", model=" + model + ", weight=" + weight + ", year=" + year
				+ ", horsePower=" + horsePower + "]";
	}
	
	
}
