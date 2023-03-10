package com.ua.robot.homework15;

public interface Flyable {
	public default void start() {
		System.out.println("plane start");
	}
	public default void go(){
		System.out.println("plane fly");
	}
	public default void stop(){
		System.out.println("plane arrive");
	}
	
}
