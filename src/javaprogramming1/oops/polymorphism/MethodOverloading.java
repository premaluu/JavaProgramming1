package javaprogramming1.oops.polymorphism;

public class MethodOverloading {
    public static void sum(int a, int b) {
        System.out.println("addition :- "+(a+b)); //integer constrain promoted into long 
    }
    public static void sum(int a, long b) {
        System.out.println("Subtraction :- "+(a-b));
    }
    public static void sum(long a, long b) {
        System.out.println("Multiplication :- "+(a*b));
    }
    public static void sum(short a, double b, double x) {
        System.out.println("Division :- "+(a/b));
    }
    public static void main(String args[]) {
        sum((short) 10.05, 10, 10.23);
    }
}