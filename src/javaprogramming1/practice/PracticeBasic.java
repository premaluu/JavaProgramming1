package javaprogramming1.practice;

public class PracticeBasic {
    public static void main(String[] args) {
        //Data typesLq
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
        System.out.println("Left shift :- " + (byte_var << 1)); // 20 1010 -> 10100
        System.out.println("Right shift :- " + (byte_var >> 1)); // 5 1010 -> 0101

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

        //Conditional Statement
        if (byte_var > short_var) {
            System.out.println("Byte is greater");
        } else if (short_var > byte_var) {
            System.out.println("Short is greater");
        } else {
            if (int_var > byte_var && int_var > short_var) {
                System.out.println("Integer is greater than all");
            } else {
                System.out.println("Short is greater then all");
            }
        }
        //Switch statement
        int choice = 4;
        switch (choice) {
            case 1:
                System.out.println("Byte var is selected ");
                break;
            case 2:
                System.out.println("Short var is selected");
                break;
            case 3:
                System.out.println("Int var is selected");
                break;
            case 4:
                System.out.println("Long var is selected");
                break;
            default:
                System.out.println("Enter the valid choice (Among 1 to 4)");
                break;
        }

        //looping
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

        for (i = 0; i < 5; i++) {
            System.out.println(i);
        }
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int ele : arr) {
            System.out.println(ele);
        }
        outerLoop:
        for (i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i >= 1) {
                    break outerLoop;
                } else {
                    System.out.println(j);
                }
            }
        }
    }
}