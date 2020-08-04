package javaprogramming1.oops.thiskeyword;

public class This1 {
    public static void main(String args[]) {
        Student s = new Student(101, "Premal");
        System.out.println("Id :- "+s.getId());
        System.out.println("Name :- "+s.getName());
        s.copyCurrentObject();
        System.out.println(s);
        s.printObjectReferenceId();
    }
}