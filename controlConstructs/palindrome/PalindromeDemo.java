package com.kn.palindrome;

import java.util.Scanner;

public class PalindromeDemo {

	public static void main(String[] args) {
		// user input of number for check palindrome
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		// Create a new object of the class plaindrome
		Palindrome palindrome = new Palindrome();
		// calling the method of class plaindrome
		palindrome.check(num);
		// Release resourses
		sc.close();

	}

}
