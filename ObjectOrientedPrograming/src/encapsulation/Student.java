package encapsulation;

public class Student {
	private int id;
	private String name;
	private int marks;
	private String branch;

	public Student() {
		super();
	}

	public Student(int id, String name, int marks, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.branch = branch;
	}

	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}
