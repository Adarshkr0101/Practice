package com.kn.reverseString;

public class StringReverse {
	public static String reverse(String input) {
		// convert to character array
		char crr[] = input.toCharArray();
		// create stringbuffer
		StringBuffer stringbuffer = new StringBuffer();
		// keep appending every character one by one
		for(int i=crr.length-1;i>=0;i--) {
			stringbuffer.append(crr[i]);
		}
		// rebuild string from stringbuffer
		return new String(stringbuffer);
	}

}
