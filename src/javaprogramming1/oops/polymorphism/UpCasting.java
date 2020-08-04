package javaprogramming1.oops.polymorphism;

public class UpCasting {
    public static void main(String args[]) {
        Bank bank = new Bank(101, "Anand");
        System.out.println("Overall bank rate of interest :- "+bank.getRateOfInterest());
        bank = new Sbi(101, "Anand", "SBI");
        System.out.println("Satte bank of india rate of interest :- "+bank.getRateOfInterest());
        bank = new Icici(101, "Anand", "ICICI");
        System.out.println("Icici rate of interest :- "+bank.getRateOfInterest());
        bank = new Apc(101, "Anand", "Apc");
        System.out.println("Apc rate of interest :- "+bank.getRateOfInterest());
    }
}