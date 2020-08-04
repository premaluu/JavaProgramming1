package javaprogramming1.oops.inheritance;

public class Ferrari implements Car {
	@Override
	public void run() {
		System.out.println("\nFerrari is running");
	}
	@Override
	public void shiftGear() {
		System.out.println("\nFerrari gear shifted");
	}
}