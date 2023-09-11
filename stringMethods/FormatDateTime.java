package com.kn.stringMethods;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDateTime {

	public static void main(String[] args) {
		Date currentDate=new Date();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-mm-yyyy");
		String formattedDate=dateFormat.format(currentDate);
		System.out.println("Current Date : "+formattedDate);
		String name = "Bob";
		int score = 85;

		System.out.printf("Name: %s, Score: %d%n", name, score);

	}

}
