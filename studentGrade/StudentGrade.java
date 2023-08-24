package com.kn.studentGrade;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		// Take input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Grade");
		int grade = sc.nextInt();
		// Create the Check Grade object
		CheckGrade gradeof = new CheckGrade();
		//Categorize the students grade
		gradeof.check(grade);
		// close the scanner object
		sc.close();

	}

}
