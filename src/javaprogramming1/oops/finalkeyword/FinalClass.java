package javaprogramming1.oops.finalkeyword;

final class Employee {

    int id = 10;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return("Employee id :- "+this.id+"\nEmployee name :- "+this.name);
    }
}

public class FinalClass {

    public static void main(String args[]) {
        Employee e = new Employee(101, "Premal");
        System.out.println(e.toString());
    }
}
