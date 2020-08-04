package javaprogramming1.oops.inheritance;

public class ImplementorMulInheritanceClass implements Scanner1,Printer1 {
	@Override
	public void scan() {
		System.out.println("Scanning...");
	}

	@Override
	public void print() {
		System.out.println("Printing...");
	}
	
	@Override
	public void show() {
		System.out.println("Showing...");
	}
}