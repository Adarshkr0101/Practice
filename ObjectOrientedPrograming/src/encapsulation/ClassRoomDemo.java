package encapsulation;

public class ClassRoomDemo {

	public static void main(String[] args) {
		ClassRoom c1 = new ClassRoom(20);
		System.out.println("Temprature = " + c1.getTemprature());
		c1.setTemprature(40);
		c1.setTemprature(25);
		System.out.println("Temprature = " + c1.getTemprature());
		
		

	}

}
