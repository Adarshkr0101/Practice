package com.kn.chainingConstructor;

public class ChainingConstructorDemo {

	public static void main(String[] args) {
		//EngStudent e = new EngStudent();
		 //EngStudent e = new EngStudent(10);
		 //EngStudent e = new EngStudent("CSE");
		EngStudent e = new EngStudent(12, "ISE");
		System.out.println("Roll number = " + e.id);
		System.out.println("Name = " + e.name);
		System.out.println("Sem = " + e.semid);
		System.out.println("Branch = " + e.branch);

	}

}
