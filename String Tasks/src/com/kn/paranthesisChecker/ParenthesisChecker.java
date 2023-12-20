package com.kn.paranthesisChecker;

import java.util.Scanner;

public class ParenthesisChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the parenthesis string");
		String input = sc.nextLine();
		char[] crr = input.toCharArray();
		sc.close();
		int parenthesis = 0;
		int curlyBracket = 0;
		int squareBraket = 0;
		for (int i = 0; i < crr.length; i++) {
			if (crr[i] == '{') {
				curlyBracket++;
			} else if (crr[i] == '(') {
				parenthesis++;
			} else if (crr[i] == '[') {
				squareBraket++;
			} else if (crr[i] == '}') {
				curlyBracket--;
			} else if (crr[i] == ')') {
				parenthesis--;
			} else if (crr[i] == ']') {
				squareBraket--;
			}
		}
		if (squareBraket == 0 && curlyBracket == 0 && parenthesis == 0) {
			System.out.println("Given String is valid  ");
		} else {
			System.out.println("String is invalid");
		}
	}

}
