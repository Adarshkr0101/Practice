package com.kn.patternPrograms;
import java.util.Scanner;
//Floyd's Triangle in java
public class NumPatternIncrese1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r=sc.nextInt();
		sc.close();
		int k=1;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k++);
				//System.out.println(k+1);
			}
			System.out.println("");
		}

	}

}
