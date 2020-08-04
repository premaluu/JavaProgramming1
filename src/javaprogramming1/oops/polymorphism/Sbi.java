package javaprogramming1.oops.polymorphism;
//This class is being used in UpCasting
public class Sbi extends Bank{
    String bankName;
    
    public Sbi(int id, String branch, String bankName) {
        super(id, branch);
        this.bankName = bankName;
    }
    @Override
    public double getRateOfInterest() {
        return 6.8;
    }
    
}