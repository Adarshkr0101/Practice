package com.weekDay;

import java.util.Scanner;

public class FindDay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		WeekDaySelection n = new WeekDaySelection();
		System.out.println("enter a day");
		String inputday = scan.next();
		n.weekDaySelection(inputday);
		scan.close();

	}

}