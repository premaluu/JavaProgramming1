//program of initializing object by reference variable
package javaprogramming1.oops;
public class Program2 {
    public static void main(String args[]) {
        Student s = new Student();
        s.id = 1;
        s.name = "Premal";
        System.out.println("Id :- "+s.id);
        System.out.println("Name :- "+s.name);
    }
}