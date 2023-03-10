package com.ua.robot.homework15;

public class Main {

	public static void main(String[] args) {
		PlaneDriver pd = new PlaneDriver();
		pd.voice();
		pd.drive();
		pd.start();
		pd.go();
		pd.stop();
		
		Driveable cardriver = new Driver(); //call interface which should realize as CarDriver() but here we can not use CarDriver methods
		cardriver.start();
		cardriver.go();
		cardriver.stop();

		Biker biker = new Biker();
		biker.voice();
		biker.drive();
		biker.start();
		biker.go();
		biker.stop();
	}

}
