package com.ua.robot.homework15;

public class Biker extends Driver{

	@Override
	public void start() {
			System.out.println("bike start");
	}

	@Override
	public void go() {
		System.out.println("bike go");
	}

	@Override
	public void stop() {
		System.out.println("bike stop");
	}

	@Override
	public void voice() {
		System.out.println("Hi I'm biker");
	}

	@Override
	public void drive() {
		System.out.println("wrum-wrum");
	}

}
