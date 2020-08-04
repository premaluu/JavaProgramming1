package javaprogramming1.oops.inheritance;

public class AllCarImpl extends Ferrari implements Lamborghini {
	@Override
	public void run() {
		System.out.println("\nLamborghini Running");
	}
	@Override
	public void shiftGear() {
		System.out.println("\nLamborghini Gear shifted");
	}
	public static void main(String args[]) {
		Lamborghini lamborghini = new AllCarImpl();
		Ferrari ferrari = new Ferrari();
		lamborghini.run();
		lamborghini.shiftGear();
		ferrari.run();
		ferrari.shiftGear();
	}
}