package javaprogramming1.looping;

public class Pyramid {
    public static void main(String args[]) {
        int i, j;
        
        for(i = 0 ; i < 10 ; i++) {
            for(int k = 0 ; k < 10-i-1 ; k++) {
                System.out.print(" ");
            }
            for(j = 0 ; j < i ; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}