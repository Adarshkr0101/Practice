package com.kn.convertFirstCaseInSentence;

import java.util.Scanner;

public class ConvertFirstCaseInSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence of Strings");
		String input = sc.nextLine();
		String result = convertCase(input);
		System.out.println("********************");
		System.out.println(result);
		System.out.println(input.equalsIgnoreCase(result));
		sc.close();
	}

	public static String convertCase(String input) {
		String[] srr = input.split(" ");
		String temp = null;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < srr.length; i++) {
			char[] crr = srr[i].toCharArray();
			for (int k = 0; k < 1; k++) {
				if (crr[k] >= 97 && crr[k] <= 122) {
					crr[k] = (char) (crr[k] - 32);
				}

			}
			temp = new String(crr);
			if (i == 0) {
				sb.append(temp);
			} else {
				sb.append(" " + temp);
			}

		}

		return (new String(sb));
	}

}
