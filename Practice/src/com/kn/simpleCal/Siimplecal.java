package com.kn.simpleCal;

import java.util.Scanner;

public class Siimplecal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		division();

	}
	public static void division() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two num for div");
		double num1=sc.nextDouble();
		double num2=sc.nextDouble();
		double res=num2/num1;
		System.out.println("Division="+res);
		sc.close();
		
	}

}
