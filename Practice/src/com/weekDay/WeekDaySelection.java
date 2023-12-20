package com.weekDay;

public class WeekDaySelection {

	public  void weekDaySelection (String inputday) {
		if(inputday.equals("1")) {
			System.out.println("day is sunday");
		}else if(inputday.equals("2")) {
			System.out.println("day is monday");
		}else if(inputday.equals("3")) {
			System.out.println("day is tuesday");
		}else if(inputday.equals("4")) {
			System.out.println("day is wendsday");
		}else if(inputday.equals("5")) {
			System.out.println("day is thursday");
		}else if(inputday.equals("6")) {
			System.out.println("day is friday");
		}else if(inputday.equals("7")) {
			System.out.println("day is saturday");
		}else {
			System.out.println("invalid inpiut");
		}
	}
	}