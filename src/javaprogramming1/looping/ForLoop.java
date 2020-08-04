package javaprogramming1.looping;

public class ForLoop {
    public static void main(String args[]) {
        int i;
        
        for(i = 0 ; i < 10 ; i++) {
            System.out.println("Loop number :- "+(i+1));
            for(int j = 0 ; j < 5 ; j++) {
                System.out.println(j+1);
            }
        }
    }
}