package encapsulation;

public class DogDemo {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.setName("Moti");
		d.setBread("german bull dog");
		System.out.println("Dog Name = "+d.getName());
		System.out.println("Dog Color = "+d.getColor());
		System.out.println("Dog Bread = "+d.getBread());
		System.out.println("Dog isVacinated = "+d.getIsVacinated());
		System.out.println("********************************");
		Dog d1=new Dog("jimmy","brown","bull dog","yes");
		d1.bark();
		d1.eat();
		System.out.println("Dog Name = "+d1.getName());
		System.out.println("Dog Color = "+d1.getColor());
		System.out.println("Dog Bread = "+d1.getBread());
		System.out.println("Dog isVacinated = "+d1.getIsVacinated());
		System.out.println("********************************");
		Dog d2=new Dog("Bommy","brown","golden retriever","yes");
		d2.bark();
		d2.eat();
		System.out.println("Dog Name = "+d2.getName());
		System.out.println("Dog Color = "+d2.getColor());
		System.out.println("Dog Bread = "+d2.getBread());
		System.out.println("Dog isVacinated = "+d2.getIsVacinated());
	}

}
