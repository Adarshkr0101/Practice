package com.kn.stringMethods;

public class Comparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = "hello";
		boolean isEqual = str1.equals(str2); // false
		boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2); // true
		int comparisonResult = str1.compareToIgnoreCase(str2); // > 0 (case-sensitive)
		System.out.println(isEqual);
		System.out.println(isEqualIgnoreCase);
		System.out.println(comparisonResult);
	}

}
