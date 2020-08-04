package javaprogramming1.oops.abstraction.abstractioninterface;
public class StackInterface {
	public static void main(String args[]) {
		FixedStack stack = new FixedStack(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.display();
		stack.push(1);
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
	}
}