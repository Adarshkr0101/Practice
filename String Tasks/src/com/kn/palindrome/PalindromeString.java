package com.kn.palindrome;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to check palidrome");
		String input=sc.nextLine();
		StringBuffer sb=new StringBuffer();
		for(int i=input.length()-1;i>=0;i--) {
			sb.append(input.charAt(i));
		}
		sc.close();
		String reversedString = new String(sb);
		System.out.println(reversedString);
		if(reversedString.equals(input)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not a palindrome");
		}
	}

}
