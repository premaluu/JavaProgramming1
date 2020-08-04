package javaprogramming1.oops.polymorphism;

public class Person {
    int id;
    String name;
    {
        id = 0;
        name = null;
        System.out.println("Person class instance initializer block executed");
    }
    static {
        System.out.println("Static block");
    }
    public Person() {
    
    }
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Person class constructor executed");
    }
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public void setId(int id) {
       this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
}
