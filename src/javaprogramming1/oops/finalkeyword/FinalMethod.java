package javaprogramming1.oops.finalkeyword;
class Student {
    public final void display() {
        System.out.println("Student class");
    }
}
public class FinalMethod extends Student{
    //note :- final methods are inherited but it can't be override
    public static void main(String args[]) {
        FinalMethod finalMethod = new FinalMethod();
        finalMethod.display();
    }
}
