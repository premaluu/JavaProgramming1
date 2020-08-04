package javaprogramming1.oops.statickeyword;

class OuterClass {
    static String msg = "Hello world";
    
    static class InnerStaticClass {
        public void display() {
            System.out.println("Message from Inner static class method :- "+msg);
        }
    }
    class InnerClass {
        public void display() {
            System.out.println("Message from Inner class method :- "+msg);
        }
    }
}
public class StaticInnerClass {
    public static void main(String args[]) {
        OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();
        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
        
        innerStaticClass.display();
        innerClass.display();
    }
}