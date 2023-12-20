package com.kn.longestString;

import java.util.Scanner;

public class LongestString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence of strings");
		String input = sc.nextLine();
		String[] srr = input.split(" ");
		int maxLength = srr[0].length();
		String longest = srr[0];
		for (int i = 1; i < srr.length; i++) {
			if (maxLength < srr[i].length()) {
				longest = srr[i];
				maxLength = srr[i].length();
			}
		}
		System.out.println("Longest String = "+longest);
		System.out.println("Longest Length = "+maxLength);
		sc.close();
	}

}
