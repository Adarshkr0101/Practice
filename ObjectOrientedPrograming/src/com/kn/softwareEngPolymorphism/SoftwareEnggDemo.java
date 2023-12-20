package com.kn.softwareEngPolymorphism;

public class SoftwareEnggDemo {

	public static void main(String[] args) {
		SoftwareEngineer s = new SoftwareEngineer();
		doActivity(s);
		System.out.println("--------------------------------------");
		s = new BackEndEng();
		doActivity(s);
		System.out.println("--------------------------------------");
		s = new DatabaseEng();
		doActivity(s);
		System.out.println("--------------------------------------");
		s = new JavaBackEndEngg();
		doActivity(s);
		System.out.println("--------------------------------------");
		s = new PythonBackEndEngg();
		doActivity(s);
	}

	public static void doActivity(SoftwareEngineer s) {
		s.writecode();
		s.attendMeeting();
		if (s instanceof BackEndEng) {
			((BackEndEng) s).doproject();
		} else if (s instanceof DatabaseEng) {
			((DatabaseEng) s).doproject();
			((DatabaseEng) s).learnSql();

		} else if (s instanceof JavaBackEndEngg) {
			((JavaBackEndEngg) s).doproject();
			((JavaBackEndEngg) s).learnJava();
		} else if (s instanceof PythonBackEndEngg) {
			((PythonBackEndEngg) s).doproject();
			((PythonBackEndEngg) s).learnPython();
		}
	}

}
