package javaprogramming1.oops.thiskeyword;

public class Student {
    int id;
    String name;
    int no;
    String nearArea;
    String city;
    int pinCode;
 
    Student() {
       this.id = 0;
       this.name = null;
    }
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    Student(int id, String name, int no, String nearArea, String city, int pinCode) {
        this(id, name);
        this.no = no;
        this.nearArea = nearArea;
        this.city = city;
        this.pinCode = pinCode;
    }
    void printObjectReferenceId() {
        System.out.println(this);
    }
    void copy(Student s) {
        System.out.println("Copy invoked...");
    }
    void copyCurrentObject() {
        copy(this);
    }
    void setId(int id) {
        this.id = id;
    }
    void setName(String name) {
        this.name = name;
    }
    int getId() {
        return this.id;
    }
    String getName() {
        return this.name;
    }
}