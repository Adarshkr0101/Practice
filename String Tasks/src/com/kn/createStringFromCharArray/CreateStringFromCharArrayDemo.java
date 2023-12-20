package com.kn.createStringFromCharArray;

import java.util.Scanner;

public class CreateStringFromCharArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of character Array = ");
		int n = sc.nextInt();
		char[] crr = new char[n];
		System.out.println("Enter the character array elements");
		for (int i = 0; i < n; i++) {
			System.out.println("Enter " + (i + 1) + " character");
			crr[i] = sc.next().charAt(0);
		}
		System.out.println("charcters converting to string \n new string = " + CreateStringFromCharArray.create(crr));
		sc.close();

	}

}
