package com.kn.concateString;

import java.util.Scanner;

public class StringConcateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String 1 = ");
		String s1 = sc.nextLine();
		System.out.print("Enter String 2 = ");
		String s2 = sc.nextLine();
		System.out.print("Enter String 3 = ");
		String s3 = sc.nextLine();
		System.out.println("Concatination of three strings without using inbuilt method \n" + StringConcte.concate(s1, s2, s3));
		System.out.println("Concatination of three strings with using inbuilt method \n" + StringConcte.concateUsingInbuilt(s1, s2, s3));
		sc.close();
	}

}
