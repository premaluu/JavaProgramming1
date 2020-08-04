//program of initializing object by methods
package javaprogramming1.oops;

public class Program3 {
    public static void main(String args[]) {
        Student s = new Student();
        s.setId(1);
        s.setName("Premal");
        System.out.println(s.id);
        System.out.println(s.name);
    }
}