package com.kn.ConcatinationString ;

import java.util.Scanner;

public class ConcatinationString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String 1 = ");
		String s1=sc.nextLine();
		System.out.print("Enter String 2 = ");
		String s2=sc.nextLine();
		System.out.print("Enter String 3 = ");
		String s3=sc.nextLine();
		System.out.println("Concatination of three strings = "+(s1+s2+s3));
		sc.close();
	}

}
