package javaprogramming1.oops.statickeyword;

public class Counter {
    static int count;
    
    Counter() {
        count++;
        System.out.println(count);
    }
}