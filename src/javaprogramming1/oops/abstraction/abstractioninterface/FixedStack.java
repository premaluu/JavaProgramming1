package javaprogramming1.oops.abstraction.abstractioninterface;

public class FixedStack implements IntStack {
	int stck[];
	int top = -1;
	int size;

	public FixedStack(int size) {
		this.size = size;
		stck = new int[size];
		this.top = -1;
	}
	
	@Override
	public void push(int data) {
		if(top >= size-1) {
			System.out.println("Stack Overflow");
		} else {
			stck[++top] = data;
		}
	}

	@Override
	public int pop() {
		if(top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			return stck[--top];
		}
	}

	@Override
	public void display() {
		if(top == -1) {
			System.out.println("Stack is Empty");
		} else {
			for(int i = 0 ; i <= top ; i++) {
				System.out.println(stck[i]);
			}
		}
	}
}