package com.ua.robot.homework11;

public class Car {

	private String type;
	protected String model;
	protected int weight;
	protected int year;
	protected int horsePower;
	
	
	
	public Car() {
		super();
	}
	public Car(String type, String model, int weight, int year, int horsePower) {
		super();
		this.type = "simple car"; //I want this Class type constant 
		this.model = model;
		this.weight = weight;
		this.year = year;
		this.horsePower = horsePower;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	
	//return car type
	String returnType() {
		return type  = "simple car";
	}
	
	@Override
	public String toString() {
		return "Car [type=" + type + ", model=" + model + ", weight=" + weight + ", year=" + year + ", horsePower="
				+ horsePower + "]";
	}
	
	
	
}
