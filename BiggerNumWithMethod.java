
public class Main {
    public static void main(String[] args) {
int max = getMax(10,4);
        System.out.println("the bigger number is "+max);


    }
    public static int getMax(int num1, int num2){
        if(num1>num2){
            return num1;
        } else {
            return num2;

        }
    }

}



