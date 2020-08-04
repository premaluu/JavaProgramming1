package javaprogramming1.oops.polymorphism;
//This class is being used in UpCasting class
public class Apc extends Bank{
    String  bankName;
    
    public Apc(int id, String branch, String bankName) {
        super(id, branch);
        this.bankName = bankName;
    }
    @Override
    public double getRateOfInterest() {
        return 8.9;
    }
}