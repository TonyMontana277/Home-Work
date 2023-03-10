package com.ua.robot.homework15;

public interface Driveable {
	
	public default void start() {
		System.out.println("car start");
	}
	public default void go(){
		System.out.println("car go");
	}
	public default void stop(){
		System.out.println("car stop");
	}
	

}
