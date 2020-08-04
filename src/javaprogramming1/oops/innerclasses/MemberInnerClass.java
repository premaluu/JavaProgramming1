package javaprogramming1.oops.innerclasses;

class OuterClass {
    private String msg = "Hello world";
    
    void display() {
        System.out.println("Message from outer class :- "+this.msg);
    }
    
    class InnerClass {
        void display() {
            System.out.println("Message from inner class :- "+msg);
        }
    }
}
public class MemberInnerClass {
    public static void main(String args[]) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        outerClass.display();
        innerClass.display();       
    }
}