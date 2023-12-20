package com.kn.decimalToBinary;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int num = sc.nextInt();
		sc.close();
		int[] bin = new int[100];
		int quot, i = 1, j;
		quot = num;
		while (quot != 0) {
			bin[i++] = quot % 2;
			quot = quot / 2;
		}
		System.out.print("Binary Number is = ");
		for (j = i - 1; j > 0; j--) {
			System.out.print(bin[j]);
		}

	}

}
