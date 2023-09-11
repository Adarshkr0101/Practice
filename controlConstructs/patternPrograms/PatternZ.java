package com.kn.patternPrograms;

public class PatternZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i == 1 || i == 10 || i + j == 11) {
					System.out.print("*");
				} else
					System.out.print(" ");

			}System.out.println();
		}

	}

}
