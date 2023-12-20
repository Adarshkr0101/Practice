package com.kn.hierarichalInheritance;

public class HierarichalInheritanceDemo {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.id = 01;
		e.salary = 1000.0;
		e.name = "Adarsh";
		e.designation = "Employee";
		Developer d=new Developer();
		d.id = 02;
		d.salary = 10000.0;
		d.name = "Reddy";
		d.designation = "Full Stack Developer";
		TestEngg t=new TestEngg();
		t.id = 03;
		t.salary = 12000.0;
		t.name = "Mahi";
		t.designation = "Sr QA";
		TeamLead l=new TeamLead();
		l.id = 04;
		l.salary = 14000.0;
		l.name = "Tarak";
		l.designation = "Team Lead";
		Manager m=new Manager();
		m.id = 05;
		m.salary = 10050.0;
		m.name = "papu";
		m.designation = "People Manager";
		System.out.println("**********************");
		System.out.println("=>Employee Details<=");
		System.out.println("ID = "+e.id);
		System.out.println("Name = "+e.name);
		System.out.println("Salary = "+e.salary);
		System.out.println("Designation = "+e.designation);
		System.out.println("**********************");
		System.out.println("=>Developer Details<=");
		System.out.println("ID = "+d.id);
		System.out.println("Name = "+d.name);
		System.out.println("Salary = "+d.salary);
		System.out.println("Designation = "+d.designation);
		System.out.println("**********************");
		System.out.println("=>Test Engineer Details<=");
		System.out.println("ID = "+t.id);
		System.out.println("Name = "+t.name);
		System.out.println("Salary = "+t.salary);
		System.out.println("Designation = "+t.designation);
		System.out.println("**********************");
		System.out.println("=>Team Lead Details<=");
		System.out.println("ID = "+l.id);
		System.out.println("Name = "+l.name);
		System.out.println("Salary = "+l.salary);
		System.out.println("Designation = "+l.designation);
		System.out.println("**********************");
		System.out.println("=>Manager Details<=");
		System.out.println("ID = "+m.id);
		System.out.println("Name = "+m.name);
		System.out.println("Salary = "+m.salary);
		System.out.println("Designation = "+m.designation);
		
	}

}
