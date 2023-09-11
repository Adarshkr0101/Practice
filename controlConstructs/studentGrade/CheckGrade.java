package com.kn.studentGrade;

public class CheckGrade {
	// Method to fing grade is above 50 or not
	public void check(int grade) {
		// checking condition grade greater than 50
		if (grade > 50) {
			System.out.println("Student is pass");
		} else
			System.out.println("Try again");
	}

}
