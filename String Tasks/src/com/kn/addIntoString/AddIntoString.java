package com.kn.addIntoString;

import java.util.Scanner;

public class AddIntoString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a sentence of strings");
		String input=sc.nextLine();
		String[] crr=input.split(" ");
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<crr.length;i++) {
			sb.append(crr[i]);
			if(i<crr.length-1) {
				sb.append("99");
			}
		}
		System.out.println(new String(sb));
		sc.close();
	}

}
