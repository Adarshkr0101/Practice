package com.kn.getCharacter;

import java.util.Scanner;

public class GetCharacterDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String string = sc.nextLine();
		System.out.println("Enter the index");
		int index = sc.nextInt();
		System.out.println("using inbuilt method \nCharacter found at index " + index + " is = " + GetCharacter.gercharUsingCharAt(string, index));
		System.out.println("----------------------------------");

		System.out
				.println("using converting to array method\nCharacter found at index " + index + " is = " + GetCharacter.gerchar(string, index));
		sc.close();
	}

}
