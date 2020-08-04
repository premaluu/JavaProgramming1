//example program of copy contstructor
package javaprogramming1.oops;

public class Program8 {

    public static void main(String args[]) {
        Student s = new Student(101, "Premal");
        Student s1 = new Student();
        s1 = s; //copying constructor
        System.out.println("Details of student 1 :- ");
        System.out.println("Id :- " + s.getId());
        System.out.println("Name :- " + s.getName());

        System.out.println("Details of sutdent 2 :- ");
        System.out.println("Id :- " + s1.getId());
        System.out.println("Name :- " + s1.getName());

        System.out.println("You see both object has same values..");
    }
}
