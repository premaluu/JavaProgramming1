package javaprogramming1.conditional;


public class Switch {
    public static void main(String args[]) {
        int a = 400;
        int b = 200;
        int c = 30;
        switch((a > b)?(a > c)?a:c:(b > c)?b:c) {
            case 400:
                System.out.println("a is greater");
                break;
            case 200:
                System.out.println("b is greater");
                break;
            case 30:
                System.out.println("c is greater");
        }
    }
}