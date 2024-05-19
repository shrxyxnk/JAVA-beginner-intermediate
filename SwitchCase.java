import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
    Scanner Scanner = new Scanner(System.in);
    System.out.println("1>coffee");
    System.out.println("2>tea");
    System.out.println("3>Coca Cola");
    System.out.println("Enter your choice");
    int choice = Scanner.nextInt();

    switch(choice){
case 1:
  System.out.println("Take your Coffee");
break;

case 2:
   System.out.println("Take your Tea");
   break;

case 3:
   System.out.println("take your coca-cola");
   break;


    }
}


}
