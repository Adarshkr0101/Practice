package com.kn.compareString;

import java.util.Scanner;

public class CompareStringWIthoutInbuilt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1 ");
		String s1 = sc.next();
		System.out.println("Enter String 2 ");
		String s2 = sc.next();
		char[] crr = s1.toCharArray();
		char[] drr = s2.toCharArray();

		if (s1.length() == s2.length()) {
			int count = 0;
			for (int i = 0; i < crr.length; i++) {
				if (crr[i] == drr[i]) {
					count += 1;
				}
			}
			if (count == s1.length()) {
				System.out.println("Strings are equal");
			} else
				System.out.println("String are not equal");

		} else {
			System.out.println("Can't compare lengths are not same");
		}
//		boolean b = compare(s1, s2);
//		System.out.print("Strings are equal = ");
//		System.out.println(b);
		sc.close();

	}

//	public static boolean compare(String s1, String s2) {
//		// TODO Auto-generated method stub
//		if (s1.length() != s2.length()) {
//			return false;
//		} else {
//			for (int i = 0; i < s1.length(); i++) {
//				if (s1.charAt(i) != s2.charAt(i)) {
//					return false;
//				}
//			}
//		}
//		return true;
//	}

}
