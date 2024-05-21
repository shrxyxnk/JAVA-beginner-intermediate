import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a, b, t;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the value of a");
        a = Scanner.nextInt();
        System.out.println("enter the value of b");
        b = Scanner.nextInt();
        System.out.println("before swapping the values: " + a + "<->" + b);
        t = a;
        a = b;
        b = t;
        System.out.println("after swapping the values are: " + a + "<->" + b);

    }
}









