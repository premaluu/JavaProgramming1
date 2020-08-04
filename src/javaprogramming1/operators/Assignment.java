package javaprogramming1.operators;

public class Assignment {
    public static void main(String args[]) {
        int a = 10; // -> 1010
        int b = 20; // -> 10100 -> 11110 = 30
        System.out.println(b);
        b |= a;
        System.out.println(b);
    }
}