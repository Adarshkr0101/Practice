package encapsulation;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("ID = " + s1.getId());
		System.out.println("NAME = " + s1.getName());
		System.out.println("MARKS = " + s1.getMarks());
		System.out.println("BRANCH = " + s1.getBranch());
		System.out.println("*******************************");
		Student s2 = new Student(01,"Adarsh",87,"Ise");
		System.out.println("ID = " + s2.getId());
		System.out.println("NAME = " + s2.getName());
		System.out.println("MARKS = " + s2.getMarks());
		System.out.println("BRANCH = " + s2.getBranch());
		System.out.println("*******************************");
		Student s3 = new Student(02,"Shyam",77);
		System.out.println("ID = " + s3.getId());
		System.out.println("NAME = " + s3.getName());
		System.out.println("MARKS = " + s3.getMarks());
		System.out.println("BRANCH = " + s3.getBranch());
		System.out.println("*******************************");
		Student s4 = new Student(03,"Reddy",97,"Cse");
		System.out.println("ID = " + s4.getId());
		System.out.println("NAME = " + s4.getName());
		System.out.println("MARKS = " + s4.getMarks());
		System.out.println("BRANCH = " + s4.getBranch());

	}

}
