package javaprogramming1.practice;

//class
class Bike {
	int speed;
	static String company;
	//constructor
	public Bike() {
		speed = 10;
		company = "Honda";
	}
	public Bike(int speed) {
		this.speed = speed;
	}
	public Bike(Bike bike) {
		this.speed = bike.speed;
	}
	//methods
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getCompany() {
		return Bike.company;
	}
	//static methods
	public static void setCompany(String company1) {
		company = company1;
	}
}
public class PracticeOOP {
	public static void main(String args[]) {
		//  Bike bike = new Bike();
		System.out.println("Speed :- "+new Bike(50).getSpeed()); //annonymous object
		Bike bike = new Bike();
		bike.setSpeed(60);
		System.out.println("Speed :- "+bike.getSpeed());
		System.out.println("Company :- "+bike.getCompany());
		System.out.println("Speed :- "+new Bike(bike).getSpeed());
		Bike.setCompany("Suzuki");
		System.out.println("Company :- "+bike.getCompany());
		System.out.println("Speed :- "+bike.getSpeed());
	}
}
