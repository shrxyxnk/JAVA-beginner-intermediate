import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = Scanner.nextInt();
        System.out.println("enter the second number");
        int b= Scanner.nextInt();
        System.out.println("enter the third number");
        int c = Scanner.nextInt();

        System.out.println("the numbers that you entered are : " +a +b +c);

        if( a>b && a>c){
            System.out.println("The first number " +a +"is the largest out of the three");
        } else if (b>a && b>c) {
            System.out.println("The second number that you entered " +b +"is the largest out of the three");

        } else {

            System.out.println("the third number that you entered " +c + " is the largest out of the three");
        }

    }



    }





