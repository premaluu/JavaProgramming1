package javaprogramming1;

public class TypeCasting {
    public static void main(String args[]) {
        //widening typecasting (automatic or implicit)
        byte x = 10;
        double d = x;
        System.out.println(d);
        
        //narrowing typecasting (mannual or explicit)
        double y = 10;
        byte c = (byte) y;
        System.out.println(c);
    }
}