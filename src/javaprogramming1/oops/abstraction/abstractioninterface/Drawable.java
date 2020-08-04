package javaprogramming1.oops.abstraction.abstractioninterface;

public interface Drawable {
	public abstract void draw();
	default void msg() {
		System.out.println("Messaging..");
	}
}