package com.kn.stringMethodAll;

public class StringAllMethods {

	public static void main(String[] args) {
		String s1 = "Raja Ram Mohan Roy";
		//String Length 
		System.out.println("length = " + s1.length());
		System.out.println("----------------------");
		//String touppercase
		String s2 = s1.toUpperCase();
		System.out.println("Original String = " + s1);
		System.out.println("Modified String = " + s2);
		System.out.println("Modified String = " + s1.toUpperCase());
		//String tolowercase
		System.out.println("----------------------");
		String s3 = s1.toLowerCase();
		System.out.println("Original String = " + s1);
		System.out.println("Modified String = " + s3);
		System.out.println("Modified String = " + s1.toLowerCase());
		//String Trim method
		System.out.println("----------------------");
		String s4 = "     Adarsh  ";
		System.out.println("Original string = " + s4);
		System.out.println("Modifed String = " + s4.trim());
		//String StartsWith method
		System.out.println("----------------------");
		boolean b1 = s1.startsWith("Raja");
		System.out.println("Starts With = Raja");
		System.out.println(b1);
		System.out.println("----------------------");
		//String EndsWith method
		boolean b2 = s1.endsWith("Raja");
		System.out.println("Ends With = Raja");
		System.out.println(b2);
		System.out.println("----------------------");
		//String SunString method
		String sub1 = s1.substring(6);
		System.out.println("Original = " + s1);
		System.out.println("Sub String = " + sub1);
		System.out.println("----------------------");
		//String SubString with start and end value method
		String sub2 = s1.substring(6, 15);
		System.out.println("Original = " + s1);
		System.out.println("Sub String = " + sub2);
		System.out.println("----------------------");
		//String Contains method
		boolean contains = s1.contains("Raju");
		System.out.println("Original = " + s1);
		System.out.println("Contains = " + contains);
		System.out.println("----------------------");
		//String replace character method
		String replace1 = s1.replace("a", "@");
		System.out.println("Original = " + s1);
		System.out.println("Replaced Char = " + replace1);
		System.out.println("----------------------");
		//String replace String method
		String replace2 = s1.replace("Raja", "Boja");
		System.out.println("Original = " + s1);
		System.out.println("Replaced Char = " + replace2);
		System.out.println("----------------------");
		//String  String converting to array method
		char[] crr = s1.toCharArray();
		System.out.println("Original = " + s1);
		System.out.println("String to array");
		for (char c : crr) {

			System.out.print(c + " ");
		}

		System.out.println("\nReverse String ");
		for (int i = crr.length - 1; i >= 0; i--) {
			System.out.print(crr[i]);
		}
		//String Split method
		String[] srr = s1.split(" ");
		System.out.println("\n--------------------");
		System.out.println("Original String = " + s1);
		System.out.println("String After Spliting");
		for (String s : srr) {
			System.out.print(s + ",");
		}
		System.out.println("\nReverse words of a string");
		for (int i = srr.length - 1; i >= 0; i--) {
			System.out.print(srr[i] + " ");
		}
		System.out.println("\n----------------------");
		//method to return character og a string mentioned
		char s6 = s1.charAt(10);
		System.out.println("Original String = " + s1);

		System.out.println("Character at given index = " + s6);
		System.out.println("\n----------------------");
		//String uppercase with numbers and special charaters
		String s9 = "Raja Ram Mohan123!@#";
		String s8 = s9.toUpperCase();
		System.out.println("Original String = " + s9);
		System.out.println("Uppercase  String = " + s8);
		System.out.println("Lowercase  String = " + s8.toLowerCase());
		System.out.println("-----------------------");
		//String comapre with ignore case
		String s10="Adarsh";
		String s11="AdArSh";
		System.out.println("String 1 ="+s10);
		System.out.println("String 2 ="+s11);
		System.out.println("Equals Ignore case = "+s10.equalsIgnoreCase(s11));
		System.out.println("----------------------------");
		//String compareTo method
		String sa="SACHIN";
		String sb="SAURAV";
		System.out.println(sa.compareTo(sb));
		//String Intern method
		System.out.println("----Intern method----");
		String a=new String("java");
		String b=a.intern();
		System.out.println(a==b);
		System.out.println(a.equals(b));
		String c="java";
		System.out.println(a==c);
		System.out.println(b==c);

	}

}
