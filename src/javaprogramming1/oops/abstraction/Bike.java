package javaprogramming1.oops.abstraction;

public abstract class Bike {
	public Bike() {
		System.out.println("\nBike is created..");
	}
	public abstract void run();
	public void gearChange() {
		System.out.println("\nGear changed..");
	}
}