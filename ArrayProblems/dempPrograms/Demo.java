package com.kn.dempPrograms;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the array elements of "+n);
		int[] array = new int[n];
		for (int j = 0; j <= n-1; j++) {
			array[j] = sc.nextInt();
		}
		System.out.println("The Array elements are : ");
		/*for (int i = 0; i <= n-1; i++) {
			System.out.println(array[i]);
		}*/
		for(int arr:array) {
			System.out.print(arr+" ");
		}
		sc.close();

	}

}
