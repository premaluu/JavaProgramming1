package javaprogramming1.oops;

public class Program1 {
    int id;
    String name;
    public static void main(String args[]) {
        Student s = new Student();
        s.id=1;
        s.name="Premal";
        System.out.println("Id :- "+s.id);
        System.out.println("Name :- "+s.name);
        System.out.println(s);
    }
}