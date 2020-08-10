package javaprogramming1.practice;

 class Animal {
    public int a = 10;
    public void display() {
	System.out.println("\n In animal class.."); 
    }
}

class Dog extends Animal {
    public int a = 15;
    @Override
    public void display() {
	System.out.println("\nIn dog class..");
    }
    public void displayUnique() {
	System.out.println("In unique display method of dog class..");
    }
    public static Dog downCast(Animal a) {
	Dog d;
	if(a instanceof Dog) {
	    d = (Dog) a;
	    System.out.println("\n");
	    return d;
	} 
	return null;
    }
}
public class Practice1 {
    public static void main(String args[]) {
	Animal animal = new Dog();
	animal.display();
	System.out.println("\n"+animal.a);
	//animal.displayUnique(); // will cause error since downcasting is restricted with only overriden method
	Dog d = Dog.downCast(animal);
	System.out.println("\n"+d.a);
	d.display();
	d.displayUnique();
	
    }
}
