package com.kn.composition;

public class CompositionDemo {

	public static void main(String[] args) {
		Page p=new Page("hi", 01);
		Book b=new Book("Java", p);
		b.writeinbook("Java",p);
		p.Writeinpage();
		p=null;
		System.out.println("----------------------------");
		b.writeinbook("Java",p);
	}

}
