package com.kn.gcdOfTwoNumbers;

import java.util.Scanner;

public class GcdOfTwoNumbersDemo {

	public static void main(String[] args) {
		// Take user input of two numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1 ");
		int num1 = sc.nextInt();

		System.out.println("Enter numbers 2 ");
		int num2 = sc.nextInt();
		// Create the new object of class GcdOfTwoNumbers
		GcdOfTwoNumbers gcdOfTwoNumbers = new GcdOfTwoNumbers();
		// calling the method of class
		int answer= (int) gcdOfTwoNumbers.gcd(num1, num2);
		System.out.println("GCD of "+num1+" and "+num2+" is "+answer);
		//calling method to find LCM of two numbers
		int lcm=(int)gcdOfTwoNumbers.lcm(num1,num2,answer);
		System.out.println("LCM of "+num1+" and "+num2+" is "+lcm);
		// release resource
		sc.close();
	}

}
