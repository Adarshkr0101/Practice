package encapsulation;

public class Dog {
	private String name;
	private String color;
	private String bread;
	private String isVacinated;
	public Dog(String name, String color, String bread) {
		super();
		this.name = name;
		this.color = color;
		this.bread = bread;
	}
	public Dog() {
		super();
	}
	public Dog(String name, String color, String bread, String isVacinated) {
		super();
		this.name = name;
		this.color = color;
		this.bread = bread;
		this.isVacinated = isVacinated;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBread() {
		return bread;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	public String getIsVacinated() {
		return isVacinated;
	}
	public void setIsVacinated(String isVacinated) {
		this.isVacinated = isVacinated;
	}
	public void bark() {
		System.out.println("bow bowwwwwww");
	}
	public void eat() {
		System.out.println("Dog is eaten");
	}

}
