package com.kn.hybridInheritance;

public class HybridInheritanceDemo {

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "arun";
		p.age = 25;
		System.out.println("Person name = " + p.name);
		System.out.println("Persons age = " + p.age);
		System.out.println("********************");
		Student s = new Student();
		s.name = "tharun";
		s.age = 35;
		s.rollNumber = 123;
		System.out.println("Student name = " + s.name);
		System.out.println("Student age = " + s.age);
		System.out.println("Student roll number = " + s.rollNumber);
		System.out.println("********************");
		Medical m = new Medical();
		m.name = "medavi";
		m.age = 35;
		m.rollNumber = 1243;
		System.out.println("Medical Student name = " + m.name);
		System.out.println("Medical Student age = " + m.age);
		System.out.println("Medical Student roll number = " + m.rollNumber);
		System.out.println("********************");
		Engineering e = new Engineering();
		e.name = "rocky";
		e.age = 25;
		e.rollNumber = 98;
		System.out.println("Engineering Student name = " + e.name);
		System.out.println("Engineering Student age = " + e.age);
		System.out.println("Engineering Student roll number = " + e.rollNumber);
		System.out.println("********************");
		Trainer t = new Trainer();
		t.name = "Arin sir";
		t.age = 16;
		t.experience = 10;
		System.out.println("Trainer name = " + t.name);
		System.out.println("Trainer age = " + t.age);
		System.out.println("Trainer experince = " + t.experience);
		System.out.println("********************");
		JavaTrainer j = new JavaTrainer();
		j.name = "Arun sir";
		j.age = 30;
		j.experience = 5;
		System.out.println("Java Trainer name = " + j.name);
		System.out.println("Java Trainer age = " + j.age);
		System.out.println("Java Trainer experince = " + j.experience);
		System.out.println("********************");
		SqlTrainer sql = new SqlTrainer();
		sql.name = "GS";
		sql.age = 25;
		sql.experience = 3;
		System.out.println("SQL Trainer name = " + sql.name);
		System.out.println("SQL Trainer age = " + sql.age);
		System.out.println("SQL Trainer experince = " + sql.experience);
		System.out.println("********************");

	}

}
