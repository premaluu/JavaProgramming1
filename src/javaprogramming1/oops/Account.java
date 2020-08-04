package javaprogramming1.oops;

public class Account {
    int acc_no;
    String name;
    double balance;
    
    Account(int acc_no, String name, double balance) {
        this.acc_no = acc_no;
        this.name = name;
        this.balance = balance;
    }
    
    public void widraw(double amt) {
        if(balance < amt) {
            System.out.println("Not enough balance..");
        }
        else {
            balance = balance - amt;
            System.out.println(amt+" Ammount widrawn");
        }
    }
    public void deposite(double amt) {
        balance = balance + amt;
        System.out.println(amt+" Ammout deposited");
    }
    
    public void getBalance() {
        System.out.println("Balance :- "+ this.balance);
    }
    public void getAcc_no() {
        System.out.println("Account no :- "+this.acc_no);
    }
    public void getName() {
        System.out.println("Name :- "+this.name);
    }
}