package com.kn.arrayVsArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayLists {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[4];
		System.out.println("Enter Array Elements of strings");
		for (int i = 0; i < 4; i++) {
			arr[i] = sc.next();
		}
		sc.close();
		
		ArrayList<String> brr = new ArrayList<String>(Arrays.asList(arr));
		brr.add("love");
		brr.add("India");
		brr.set(0, "Opel");
		
		System.out.println(brr);
	}

}
