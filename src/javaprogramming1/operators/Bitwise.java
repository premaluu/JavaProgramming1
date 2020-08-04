package javaprogramming1.operators;

public class Bitwise {
    public static void main(String args[]) {
        int a = 10; //1010
        int b = 13; //1101
        
        System.out.println(a&b); //1000 -> 8
        System.out.println(a|b); //1111 -> 15
        System.out.println(a>>1); //0101 -> 5
        System.out.println(a<<1); //10100 -> 20
    }
}