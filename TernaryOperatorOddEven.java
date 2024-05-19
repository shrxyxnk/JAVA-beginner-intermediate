import java.util.Scanner;
public class Main
{
   public static void main(String[] args) {
	System.out.println("Enter a number to check if the number is odd or even");
	Scanner Scanner =  new Scanner(System.in);
    int number = Scanner.nextInt();

	
	   String result = (number % 2) == 0 ?"even":"odd";
	   System.out.println("The number is  "+ result);
	}
	
}
