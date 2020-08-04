package javaprogramming1.looping;

public class ForEachLoop {
    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        for(int val : arr) {
            System.out.println(val);
        }
    }
}