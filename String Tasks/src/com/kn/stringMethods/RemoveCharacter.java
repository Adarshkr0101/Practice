package com.kn.stringMethods;

import java.util.Scanner;

public class RemoveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		System.out.println("Enter the character to remove");
		char c = sc.next().charAt(0);

		System.out.println("Enter the character to replace");
		char c1 = sc.next().charAt(0);
		System.out.println("Enter character to replace and add");
		String c2 = sc.next();
		String str2 = replace(str, c1, c2);
		System.out.println("After Replacing==" + str2);
		String str1 = remove(str, c);
		System.out.println("After removing the charcter then string==" + str1);
		sc.close();

	}

	public static String replace(String str, char c1, String c2) {
		if (str == null) {
			return null;
		}

		return str.replaceAll(Character.toString(c1), c2);
	}

	public static String remove(String str, char c) {
		if (str == null) {
			return null;
		}

		return str.replaceAll(Character.toString(c), "");
	}

}
