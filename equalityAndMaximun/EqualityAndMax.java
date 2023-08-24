package com.kn.equalityAndMaximun;

public class EqualityAndMax {

	public void find(int num1, int num2, int num3) {
		// creating the method for equality and larger of three
		if (num1 == num2 && num1 == num3) {
			System.out.println("Numbers are equal");
		}
		else if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + ":is greater among all of three");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + ":is greater among all of three");
		} else
			System.out.println(num3 + ":is greater among all of three");
	}

}
