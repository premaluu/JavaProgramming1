package javaprogramming1.oops.polymorphism;
//This class is being used in Upcasting class.
public class Bank {
    int id;
    String branch;
    
    public Bank(int id, String branch) {
        this.id = id;
        this.branch = branch;
    }
    public double getRateOfInterest() {
        return 5.7;
    }
}