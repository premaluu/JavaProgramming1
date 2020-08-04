package javaprogramming1.oops.polymorphism;
//This class is being used in UpCasting class
public class Icici extends Bank{
    String bankName;
    
    public Icici(int id, String branch, String bankName) {
        super(id, branch);
        this.bankName = bankName;
    }
    @Override
    public double getRateOfInterest() {
        return 7.8;
    }
}