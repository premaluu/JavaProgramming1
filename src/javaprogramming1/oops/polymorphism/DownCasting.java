package javaprogramming1.oops.polymorphism;

class Animal {
	int a = 10;
	void display() {
		System.out.println("In Animal class");
	}
}

class Dog extends Animal {
	int a = 15;
	@Override
	void display() {
		System.out.println("In Dog class");
	}
	void displayUnique() {
		System.out.println("In unique method");
	}
	public static Dog downCast(Animal a) {
		if(a instanceof Dog) {
			Dog d = (Dog) a;
			System.out.println("Downcasted");
			return d;
		}
		return null;
	}
}
public class DownCasting {
	public static void main(String args[]) {
		Animal a = new Dog();
		a.display();
		Dog d;
		System.out.println(a.a);
		d = Dog.downCast(a);
		d.displayUnique();
	}
}