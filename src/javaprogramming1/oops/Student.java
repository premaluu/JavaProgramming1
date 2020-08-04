package javaprogramming1.oops;

public class Student {
    int id;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    Student() {
    }
    int getId() {
        return this.id;
    }
    String getName() { 
        return this.name;
    }
    void setId(int id) {
        this.id = id;
    }
    void setName(String name) {
        this.name = name;
    }
}