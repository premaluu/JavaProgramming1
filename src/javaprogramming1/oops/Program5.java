package javaprogramming1.oops;

public class Program5 {
    public static void main(String args[]) {
        Account acc = new Account(101, "Premal", 33000.56);
        acc.getAcc_no();
        acc.getName();
        acc.widraw(100);
        acc.getBalance();
        acc.deposite(100);
        acc.getBalance();
        
    }
}