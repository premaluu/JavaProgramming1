package javaprogramming1.oops.abstraction.abstractioninterface;

public interface CircleInterface {
	final double PI = 3.14;
	 static void area(int r) {
		System.out.println("\nArea of circle :- "+(PI * r * r));
	}
}