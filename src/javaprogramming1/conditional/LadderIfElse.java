package javaprogramming1.conditional;

public class LadderIfElse {
    public static void main(String args[]) {
        int a = 10;
        int b = 100;
        int c = 30;
        
        if(a > b && a > c) {
            System.out.println("a is greater");
        }
        else if(b > c) {
            System.out.println("b is greater");
        }
        else {
            System.out.println("c is greater");
        }
    }
}