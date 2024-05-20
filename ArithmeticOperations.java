import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter any two numbers");
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int a = Scanner.nextInt();
        System.out.println("Enter the number 2");
        int b = Scanner.nextInt();
        System.out.println("enter the operation to be performed");
        System.out.println(" 1>> addition");
        System.out.println("2>>multiplication");
        System.out.println("3>>division");
        System.out.println("4>>Subtraction");

        int choice = Scanner.nextInt();

        switch(choice){

            case 1:
                System.out.println("the sum is: " + (a+b) );
                break;
            case 2:
                System.out.println("the product is "+ (a*b));
                break;
            case 3:
                System.out.println("the quotient is "+ (a/b));
                break;
            case 4:
                System.out.println("after subtracting the result is: "+(a-b));
                break;
            default:
                System.out.println("choose a valid Operation and Check the input");
        }

    }


}



