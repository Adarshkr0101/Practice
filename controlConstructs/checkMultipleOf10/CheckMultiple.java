package com.kn.checkMultipleOf10;

public class CheckMultiple {
	// method to find the multiple of 10 or not
	public void multiple(int num) {
		// check number multiple of 10 or not
		if (num % 10 == 0) {
			System.out.println(num + " : is multiple of 10");
		} else
			System.out.println(num + " : is not multiple of 10");
	}

}
