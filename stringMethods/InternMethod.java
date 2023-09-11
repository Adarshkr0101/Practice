package com.kn.stringMethods;

public class InternMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Hello");
		String s2 = "Hi";
		String s3=" ";
		System.out.println(s3);

		// Using intern() to put s1 into the string pool
		 s3 = s2.intern();

		// Now s1 and s2 will refer to the same string object in the pool
		boolean areEqual = (s1 == s2); // This will be true
		System.out.println(areEqual);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
