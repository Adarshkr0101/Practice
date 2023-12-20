package com.kn.reverseString;

import java.util.Scanner;

public class StringReverseDemo {

	public static void main(String[] args) {
		// Take string as user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to be reversed ");
		String inputString = sc.nextLine();
		// call the method of class StringReverse
		//StringReverse s=new StringReverse();
		//String s=reverse(inputString);
		System.out.println("The Reversed String = " +StringReverse. reverse(inputString));
		sc.close();
	}

}
