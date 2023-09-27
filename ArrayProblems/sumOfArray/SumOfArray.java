package com.kn.sumOfArray;

import java.util.Scanner;

public class SumOfArray {

	public int sum(int[] arr) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the "+(i+1)+" array element = ");
			arr[i] = sc.nextInt();
			sum += arr[i];

		}
		sc.close();

		return sum;
	}

}
