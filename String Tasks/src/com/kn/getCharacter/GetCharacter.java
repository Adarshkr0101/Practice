package com.kn.getCharacter;

public class GetCharacter {

	public static char gercharUsingCharAt(String string, int index) {
		// TODO Auto-generated method stub

		return string.charAt(index);
	}

	public static char gerchar(String string, int index) {
		// TODO Auto-generated method stub
		char[] crr = string.toCharArray();
		return crr[index];
	}

}
