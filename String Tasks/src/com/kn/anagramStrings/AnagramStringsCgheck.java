package com.kn.anagramStrings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramStringsCgheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string 1 = ");
		String s1 = sc.nextLine();
		System.out.print("Enter string 2 = ");
		String s2 = sc.nextLine();
		if (s1.length() == s2.length()) {
			char[] crr1=s1.toCharArray();
			char[] crr2=s2.toCharArray();
			Arrays.sort(crr1);
			Arrays.sort(crr2);
			String s3=new String(crr1);
			String s4=new String(crr2);
			
			if(s3.equals(s4)) {
				System.out.println("Strings are Anagram");
			}else {
				System.out.println("Strings are not Anagram");
			}

		} else {
			System.out.println("Invalid Strings cannot be Anagram");
		}
		sc.close();
	}

}
