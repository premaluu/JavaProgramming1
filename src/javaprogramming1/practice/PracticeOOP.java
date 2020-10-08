package javaprogramming1.practice;

//class

class Engine {
	int hp;
	int CC;
	
	public Engine() {
		hp = 5000;
		CC = 450;
	}
	
	public Engine(int hp, int CC) {
		this.hp = hp;
		this.CC = CC;
	}
	
	//methods
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void setCC(int CC) {
		this.CC = CC;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public int getCC() {
		return this.CC;
	}
}
class Bike {
	// instance variable
	int speed;
	static String company = "Honda";

	// static block
	static {
		company = "Honda";
	}

	// constructor
	public Bike() {
		this.speed = 50;
	}

	public Bike(int speed) {
		this.speed = speed;
	}

	public Bike(Bike bike) {
		this.speed = bike.speed;
	}

	// methods
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return this.speed;
	}

	public String getCompany() {
		return company;
	}

	public Bike getObject() {
		return this;
	}

	// static methods
	public static void setCompany(String company1) {
		company = company1;
	}
}

class StandardBike extends Bike {
	// instance variable
	private int fuelCapacity;
	private int hp;

	// constructor
	public StandardBike() {
		super();
		this.fuelCapacity = 20;
		this.hp = 1000;
	}

	public StandardBike(int fuelCapacity, int hp) {
		super();
		this.fuelCapacity = fuelCapacity;
		this.hp = hp;
	}

	public StandardBike(int speed, int fuelCapacity, int hp) {
		super(speed);
		this.fuelCapacity = fuelCapacity;
		this.hp = hp;
	}

	public StandardBike(StandardBike standardBike) {
		super(standardBike);
		this.fuelCapacity = standardBike.fuelCapacity;
		this.hp = standardBike.hp;
	}

	// methods
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getFuelCapacity() {
		return this.fuelCapacity;
	}

	public int getHp() {
		return this.hp;
	}
}

class SportsBike extends Bike {
	// instance
	int maxSpeed;
	int manufacturingYear;

	// constructor
	public SportsBike() {
		super(100);
		company = "Honda";
	}

	public SportsBike(int maxSpeed) {
		super(100);
		this.maxSpeed = maxSpeed;
	}

	public SportsBike(int maxSpeed, int speed) {
		super(speed);
		this.maxSpeed = maxSpeed;
	}

	public SportsBike(int maxSpeed, int manufacturingYear, int speed) {
		super(speed);
		this.maxSpeed = maxSpeed;
		this.manufacturingYear = manufacturingYear;
	}

	public SportsBike(SportsBike sportsBike) {
		super(sportsBike);
		this.maxSpeed = sportsBike.maxSpeed;
		this.manufacturingYear = sportsBike.manufacturingYear;
	}

	// methods
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void setManufacturingYear(int manufacturingYear) {
		this.manufacturingYear = manufacturingYear;
	}

	public int getMaxSpeed() {
		return this.maxSpeed;
	}

	public int getManufacturingYear() {
		return this.manufacturingYear;
	}
}

class Hayabusa extends SportsBike {
	String color;
	private Engine engine; //Aggression
	// constructor
	public Hayabusa() {
		speed = 150;
		company = "Suzuki";
	}

	public Hayabusa(int speed) {
		super(speed);
	}

	public Hayabusa(int speed, int maxSpeed) {
		super(speed, maxSpeed);
	}

	public Hayabusa(int speed, int maxSpeed, int manufacturingYear) {
		super(speed, maxSpeed, manufacturingYear);
	}

	public Hayabusa(int speed, int maxSpeed, int manufacturingYear, String color) {
		super(speed, maxSpeed, manufacturingYear);
		this.color = color;
	}
	
	public Hayabusa(int speed, int maxSpeed, int manufacturingYear, Engine engine) {
		super(speed, maxSpeed, manufacturingYear);
		this.engine = engine;
	}

	public Hayabusa(int speed, int maxSpeed, int manufacturingYear, String color,Engine engine) {
		super(speed, maxSpeed, manufacturingYear);
		this.color = color;
		this.engine = engine;
	}
	// methods
	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}
	
	public String getEngineDetails() {
		return "Hp :- "+this.engine.hp+"\nCC :- "+this.engine.CC;
	}
}

public class PracticeOOP {
	public static void main(String args[]) {
		Bike bike = new Bike();
		System.out.println("Speed :- " + bike.getSpeed());
		System.out.println("Company :- " + bike.getCompany());
		System.out.println("Speed :- " + new Bike(60).getSpeed());
		Bike.setCompany("Suzuki");
		System.out.println("Speed :- " + bike.getSpeed());
		System.out.println("Company :- " + bike.getCompany());
		Bike bike1 = bike.getObject();
		System.out.println("Speed :- " + bike1.getSpeed());
		System.out.println("Company :- " + bike1.getCompany());

		StandardBike standardBike = new StandardBike(20, 1500);
		StandardBike standardBike1 = new StandardBike(standardBike);
		System.out.println("Speed :- " + standardBike1.getSpeed());
		System.out.println("Company :- " + standardBike1.getCompany());

		SportsBike sportsBike = new SportsBike(450, 2010, 150);
		System.out.println("Speed :- " + sportsBike.getSpeed());
		System.out.println("Hight Speed :- " + sportsBike.getMaxSpeed());
		System.out.println("Manufacturing year :- " + sportsBike.getManufacturingYear());
		System.out.println("Company :- " + sportsBike.getCompany());

		SportsBike newSportsBike = new SportsBike(sportsBike);
		System.out.println("Speed :- " + sportsBike.getSpeed());
		System.out.println("Hight Speed :- " + sportsBike.getMaxSpeed());
		System.out.println("Manuacturing year :- " + sportsBike.getManufacturingYear());
		System.out.println("Company :- " + sportsBike.getCompany());
		System.out.println();
		Hayabusa hayabusa = new Hayabusa(150, 450, 2010, "White", new Engine(5000, 700));
		System.out.println("Speed :- " + hayabusa.getSpeed());
		System.out.println("High speed :- " + hayabusa.getMaxSpeed());
		System.out.println("Manufacturing year :- " + hayabusa.getManufacturingYear());
		System.out.println("Color :- " + hayabusa.getColor());
		System.out.println("Company :- " + hayabusa.getCompany());
		System.out.println(hayabusa.getEngineDetails());
	}
}