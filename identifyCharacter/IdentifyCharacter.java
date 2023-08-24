package com.kn.identifyCharacter;

import java.util.Scanner;

public class IdentifyCharacter {

	public static void main(String[] args) {
		// Take input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch = sc.next().charAt(0);
		// converting character to integer value
		int num = (int) ch;
		//Create a new FindCharacter object
		FindCharacter character = new FindCharacter();
		//Categorize the character
		character.find(num);
		// close scanner object
		sc.close();

	}

}
