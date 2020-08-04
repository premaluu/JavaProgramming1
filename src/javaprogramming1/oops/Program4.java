//program of initializing object using constructor
package javaprogramming1.oops;

public class Program4 {
    public static void main(String args[]) {
        Student s = new Student(1, "Premal");
        System.out.println("Id :- "+s.id);
        System.out.println("Name :- "+s.name);
    }
}