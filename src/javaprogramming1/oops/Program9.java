//example program of copying value of one object to another without using copy constructor
package javaprogramming1.oops;

public class Program9 {
    public static void main(String args[]) {
        Student s = new Student(101, "Premal");
        Student s1 = new Student();
        s1.id = s.id;
        s1.name = s.name;
        System.out.println("Details of student 1 :- ");
        System.out.println("Id :- "+s.getId());
        System.out.println("Name :- "+s.getName());
        
        System.out.println("Details of student 2 :- ");
        System.out.println("Id :- "+s1.getId());
        System.out.println("Name :- "+s1.getName());
        
        System.out.println("You see both has same values...");
        
    }
}