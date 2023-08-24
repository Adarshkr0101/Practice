package com.kn.identifyCharacter;

public class FindCharacter {
	/*
	 * create the method to find lower case(vowel/consonant) ,upper
	 * case(vowel/consonant), digit or special character
	 */

	public void find(int num) {
		// condition for uppercase vowel and consonants
		if (num >= 65 && num <= 90) {
			char c = (char) num;
			switch (num) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println(c + " is a Upper case vowel");
				break;
			default:
				System.out.println(c + " is a Upper  case Consonant");

			}
		} // condition for lowercase vowel and consonants
		else if (num >= 97 && num <= 122) {
			char c = (char) num;
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(c + " is a Lower Case vowel");
				break;
			default:
				System.out.println(c + " is a Lower case consonant");

			}
		} // condition for digit
		else if (num >= 48 && num <= 57) {
			char c = (char) num;
			System.out.println(c + " is a digit ");
		} // condition for special character
		else if (num >= 91 && num <= 96) {
			char c = (char) num;
			System.out.println(c + " is a special character");
		} else
			System.out.println("Invalid Input");
	}
}
