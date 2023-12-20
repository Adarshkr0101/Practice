package encapsulation;

public class ClassRoom {
	private int temprature;

	public ClassRoom(int temprature) {
		this.temprature = temprature;
	}

	public int getTemprature() {
		return temprature;
	}

	public void setTemprature(int temprature) {
		if (temprature >= 20 && temprature <= 30) {
			this.temprature = temprature;
		} else {
			System.out.println("Temprature should be in range of 20-30");
		}

	}

}
