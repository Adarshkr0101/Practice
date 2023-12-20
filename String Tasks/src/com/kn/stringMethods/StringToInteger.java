package com.kn.stringMethods;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123"; // The string containing the integer value
		try {
		    int intValue = Integer.parseInt(str); // Parse the string to an integer
		    System.out.println("String to Integer: " + intValue);
		} catch (NumberFormatException e) {
		    System.err.println("Invalid input: " + str + " is not a valid integer.");
		}

	}

}
