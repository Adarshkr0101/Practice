package com.kn.demoClass;

import java.util.Scanner;

public class FloatingArray {

	public static void main(String[] args) {
		// take the size as user input
		Scanner sc = new Scanner(System.in);
		// Array declaration and creation
		System.out.print("Enter the size of integer array = ");
		int[] frr = new int[sc.nextInt()];
		// Array initialiation
		for (int i = 0; i < frr.length; i++) {
			System.out.print("Enter Integer data for the array element " + (i + 1) + " = ");
			frr[i] = sc.nextInt();
		}
		System.out.println("==> Initialization done <==");
		for (int i = 0; i < frr.length; i++) {
			System.out.println((i + 1) + " element data = " + frr[i]);
		}
		System.out.println("==>Elements after doubleing<==");
		for(int i=0;i<frr.length;i++) {
			System.out.println((i + 1) + " element data = " + (frr[i]*2));
		}
		sc.close();
	}

}
