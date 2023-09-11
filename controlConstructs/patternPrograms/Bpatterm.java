package com.kn.patternPrograms;

public class Bpatterm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1||i==5||i==3) {
					if(j<5) {
						System.out.print("*");
					}else System.out.print(" ");
				}if(i==2||i==4) {
					if(j==1||j==5) {
						System.out.print("*");
					}else System.out.print(" ");
				}
				
			}System.out.println();
		}
	}

}
