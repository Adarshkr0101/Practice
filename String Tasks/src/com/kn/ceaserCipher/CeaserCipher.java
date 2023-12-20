package com.kn.ceaserCipher;

import java.util.Scanner;

public class CeaserCipher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to be encrypted");
		String input = sc.nextLine();
		System.out.println("Enter the integer value of encryption");
		int n = sc.nextInt();
		char[] crr = input.toCharArray();
		char[] crr2 = new char[crr.length];
		for (int i = 0; i < crr.length; i++) {
			crr2[i] = (char) (crr[i] + n);

		}
		System.out.println("Output : " + new String(crr2));
		sc.close();
	}

}
