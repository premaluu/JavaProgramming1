package javaprogramming1.practice;

public class Practice1 {
    public static void main(String args[]) {
        //Data types
        //numerical data type
        byte byte_var = 10; //1byte
        short short_var = 32000;//2byte
        int int_var = 8;//4byte
        long long_var = 420000000;//8byte

        //floating data type
        float float_var = 32.4f;//4byte
        double double_var = 42.5;//8byte
        //bitwise
        System.out.println("AND :- " + (byte_var & int_var)); // 8
        System.out.println("OR :- " + (byte_var | int_var)); // 2
        System.out.println("Left shift :- " + (byte_var >> 1)); // 5
        System.out.println("Right shift :- " + (byte_var << 1)); // 4

        //assignment
        byte_var += int_var;
        System.out.println("Addtion assignment :- " + byte_var);
        byte_var -= int_var;
        System.out.println("Subtraction assignment :- " + byte_var);
        byte_var *= int_var;
        System.out.println("Mulitplication assignment :- " + byte_var);
        byte_var /= int_var;
        System.out.println("Division assignment :- " + byte_var);

        //comparison
        System.out.println("Grater than :- " + (byte_var > int_var));
        System.out.println("less than :- " + (byte_var < int_var));
        System.out.println("Greater than equal to :- " + (byte_var >= int_var));
        System.out.println("Less than equal to :- " + (byte_var <= int_var));
        System.out.println("Equal to :- " + (byte_var == int_var));
        System.out.println("Not equal to :- " + (byte_var != int_var));

        //logical operators
        System.out.println("Logical AND :- " + ((byte_var > int_var) && (byte_var < int_var)));
        System.out.println("Logical OR :- " + ((byte_var > int_var) || (byte_var < int_var)));
        System.out.println("logical NOT :- " + !((byte_var > int_var || (byte_var < int_var))));



    }
}