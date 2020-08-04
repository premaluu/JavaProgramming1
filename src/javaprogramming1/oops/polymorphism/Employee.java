package javaprogramming1.oops.polymorphism;

public class Employee extends Person{
    double salary;
    {
        salary = 0;
        System.out.println("Employee class instance initializer block executed");
    }
    public Employee(int id, String name, double salary) {

        this.salary = salary;
        System.out.println("Employee class constructor executed");
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return this.salary;
    }
    @Override
    public String toString() {
        return("Employee id :- "+super.id+"\nEmployee name :- "+super.getName()+"\nEmployee salary :- "+this.salary);
    }
}
