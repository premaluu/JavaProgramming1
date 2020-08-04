package javaprogramming1.operators;

class Animal {
    void display() {
        System.out.println("In animal..");
    }
}
class Dog extends Animal {
    @Override
    void display() {
        System.out.println("In dog..");
    }
}
public class InstanceOf {
    public static void main(String args[]) {
       Dog d = new Dog();
       System.out.println("Instance of with same object is :- "+(d instanceof Dog));
       System.out.println("Instance of with parent class object is :- "+(d instanceof Animal));
       Animal a = new Dog(); //upcasting
       System.out.println("Instance of with same object is :- "+(a instanceof Animal));
       System.out.println("Instance of with parent class reference and child class object is :- "+(a instanceof Dog));
       a = null;
       System.out.println("Intance of with null is :- "+(a instanceof Animal));//false
       
    }
}