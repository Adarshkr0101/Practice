package com.kn.stringBuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println("Size ="+sb.length());
		System.out.println("Capacity = "+sb.capacity());
		System.out.println("---------------------------------");
		StringBuffer sa=new StringBuffer(4);
		System.out.println("Size ="+sa.length());
		System.out.println("Capacity = "+sa.capacity());
		System.out.println("---------------------------------");
		StringBuffer sc=new StringBuffer(4);
		sc.append("java");
		System.out.println("Size ="+sc.length());
		System.out.println("Capacity = "+sc.capacity());
		System.out.println(sc);
		System.out.println("*****************************");
		sc.append("jscript");
		System.out.println("Size ="+sc.length());
		System.out.println("Capacity = "+sc.capacity());
		System.out.println(sc);
	}

}
