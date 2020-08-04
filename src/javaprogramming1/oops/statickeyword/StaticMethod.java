//example program of static method
package javaprogramming1.oops.statickeyword;

public class StaticMethod {
    public static void main(String args[]) {
        Student s1 = new Student(101, "Premal");
        Student s2 = new Student(102, "Pujan");
        Student s3 = new Student(103, "Smit");
        Student s4 = new Student(104, "Darsh");
        Student s5 = new Student(105, "Shivam");
        Student s6 = new Student(106, "Shetu");
        System.out.println("Before changing school..");
        System.out.println("Student 1 details :- ");
        System.out.println("Id :- "+s1.getId());
        System.out.println("Name :- "+s1.getName());
        System.out.println("School Name:- "+s1.getSchool());
        System.out.println();
        System.out.println("Student 2 details :- ");
        System.out.println("Id :- "+s2.getId());
        System.out.println("Name :- "+s2.getName());
        System.out.println("School Name:- "+s2.getSchool());
        System.out.println();
        System.out.println("Student 3 details :- ");
        System.out.println("Id :- "+s3.getId());
        System.out.println("Name :- "+s3.getName());
        System.out.println("School Name:- "+s3.getSchool());
        System.out.println();
        System.out.println("Student 4 details :- ");
        System.out.println("Id :- "+s4.getId());
        System.out.println("Name :- "+s4.getName());
        System.out.println("School Name:- "+s4.getSchool());
        System.out.println();
        System.out.println("Student 5 details :- ");
        System.out.println("Id :- "+s5.getId());
        System.out.println("Name :- "+s5.getName());
        System.out.println("School Name:- "+s5.getSchool());
        System.out.println();
        System.out.println("Student 6 details :- ");
        System.out.println("Id :- "+s6.getId());
        System.out.println("Name :- "+s6.getName());
        System.out.println("School Name:- "+s6.getSchool());
        
        Student.changeSchool();
        
        System.out.println("School changed..");
        
        System.out.println("After changing school..");
        System.out.println("Student 1 details :- ");
        System.out.println("Id :- "+s1.getId());
        System.out.println("Name :- "+s1.getName());
        System.out.println("School Name:- "+s1.getSchool());
        System.out.println();
        System.out.println("Student 2 details :- ");
        System.out.println("Id :- "+s2.getId());
        System.out.println("Name :- "+s2.getName());
        System.out.println("School Name:- "+s2.getSchool());
        System.out.println();
        System.out.println("Student 3 details :- ");
        System.out.println("Id :- "+s3.getId());
        System.out.println("Name :- "+s3.getName());
        System.out.println("School Name:- "+s3.getSchool());
        System.out.println();
        System.out.println("Student 4 details :- ");
        System.out.println("Id :- "+s4.getId());
        System.out.println("Name :- "+s4.getName());
        System.out.println("School Name:- "+s4.getSchool());
        System.out.println();
        System.out.println("Student 5 details :- ");
        System.out.println("Id :- "+s5.getId());
        System.out.println("Name :- "+s5.getName());
        System.out.println("School Name:- "+s5.getSchool());
        System.out.println();
        System.out.println("Student 6 details :- ");
        System.out.println("Id :- "+s6.getId());
        System.out.println("Name :- "+s6.getName());
        System.out.println("School Name:- "+s6.getSchool());
    }
}