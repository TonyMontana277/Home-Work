package com.ua.robot.homework17;

public enum DayOfWeek {
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY;
	
	public void GetDayByNumber(int number) {
		switch(number) {
			case 1:
				System.out.println(DayOfWeek.SUNDAY);
				break;
			case 2:
				System.out.println(DayOfWeek.MONDAY);
				break;
			case 3:
				System.out.println(DayOfWeek.TUESDAY);
				break;
			case 4:
				System.out.println(DayOfWeek.WEDNESDAY);
				break;
			case 5:
				System.out.println(DayOfWeek.THURSDAY);
				break;
			case 6:
				System.out.println(DayOfWeek.FRIDAY);
				break;
			case 7:
				System.out.println(DayOfWeek.SATURDAY);
				break;
			default:
				System.out.println("Only numbers from 1 to 7. \nDefault: "+DayOfWeek.SUNDAY);
		}
	}
	
}
