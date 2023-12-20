package com.kn.createStringFromCharArray;

public class CreateStringFromCharArray {

	public static String create(char[] crr) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < crr.length; i++) {
			sb.append(crr[i]);
		}

		return new String(sb);
	}

}
