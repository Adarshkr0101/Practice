package com.kn.stringComparision;

public class StringComparision {

	public static void main(String[] args) {
		String s1="Adarsh";
		String s2="Reddy";
		String s4=s1+s2;
		String s3=s1+s2;
		System.out.println(s3);
		System.out.println("-->Reference Comparision<--");
		if(s3==s4) {
			System.out.println("  References are pointing to SAME object");
		}else {
			System.out.println("  References are pointing to DIFFERENT object");
		}
		System.out.println("-->Data Comparision<--");
		if (s3.equals(s4)) {
			System.out.println("  Data SAME ");
		}else {
			System.out.println("  Data DIFFERENT ");
		}

	}

}
