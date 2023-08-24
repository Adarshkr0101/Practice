package com.kn.ageCategorizer;

import java.util.Scanner;

public class AgeCategorizer {

	public static void main(String[] args) {
		// Taking input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		// Create an AgeCategorization object
		AgeCategory ageObtained = new AgeCategory();
		// Categorize the age
		ageObtained.distinguish(age);
		// close scanner class object
		sc.close();
	}

}
