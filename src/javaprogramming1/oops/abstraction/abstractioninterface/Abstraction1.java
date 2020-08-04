package javaprogramming1.oops.abstraction.abstractioninterface;

public class Abstraction1 {
	public static void main(String args[]) {
		Rectangle rectangle = new Rectangle();
		Circle circle = new Circle();
		Drawable d = new Rectangle();
		
		rectangle.draw();
		circle.draw();
		circle.msg();
		rectangle.msg();
		d.msg();
	}
}