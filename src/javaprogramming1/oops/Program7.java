//exaple program of parameterized constructor
package javaprogramming1.oops;

public class Program7 {
    public static void main(String args[]) {
        Student s = new Student(101, "Premal");
        System.out.println("Id :- "+s.getId());
        System.out.println("Name :- "+s.getName());
    }
}