package javaprogramming1.oops.statickeyword;

import javaprogramming1.oops.*;

public class Student {
    int id;
    String name = "premal";
    static String school = "BGV";
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    Student() {
    }
    
    static void changeSchool() {
        school = "JJIS";
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
    String getSchool() {
        return school;
    }
}