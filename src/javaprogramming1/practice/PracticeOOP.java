package javaprogramming1.practice;

class Bike {
	int speed;
	static String company;
	
	//constructor
	public Bike() {
		this.speed = 50;
		company = "Honda";
	}
	
	public Bike(int speed) {
		this.speed = 50;
		company = "Honda";
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
		return company;
	}
	
	//static methods
	public static void setCompany(String company1) {
		company = company1;
	}
}
public class PracticeOOP {
	public static void main(String args[]) {
		System.out.println("Speed :- "+new Bike(50).getSpeed());
		System.out.println("Company :- "+Bike.company);
	}
}