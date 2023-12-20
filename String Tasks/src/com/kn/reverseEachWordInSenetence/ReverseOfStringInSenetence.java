package com.kn.reverseEachWordInSenetence;

import java.util.Scanner;

public class ReverseOfStringInSenetence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence of strings");
		String input = sc.nextLine();
		String result = reverse(input);
		System.out.println("Output : " + result);
		sc.close();
	}

	private static String reverse(String input) {
		String[] srr = input.split(" ");
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i <= srr.length - 1; i++) {
			char[] crr = srr[i].toCharArray();
			for (int j = crr.length - 1; j >= 0; j--) {
				sb.append(crr[j]);
			}
			sb.append(" ");
		}

		return new String(sb);
	}

}
