package com.kn.binaryToDecimal;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the binary number = ");
		int num = sc.nextInt();
		int sum = 0, e = 0, digit=0;
		while (num > 0) {
			digit = num % 10;
			sum = (int) (sum + Math.pow(2, e) * digit);
			e++;
			num = num / 10;
		}
		System.out.print("Decimal number = " + sum);
		sc.close();
	}

}
