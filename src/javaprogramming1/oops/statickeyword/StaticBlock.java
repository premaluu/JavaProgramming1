package javaprogramming1.oops.statickeyword;

public class StaticBlock {
    static int a;
    static {
        a = 20;
        System.out.println("I'm in static block 2...");
    }

    static {
        a = 10;
        System.out.println("I'm in static block 1...");
    }
        public static void main(String args[]) {
        System.out.println("Value of a :- "+a);
    }
}