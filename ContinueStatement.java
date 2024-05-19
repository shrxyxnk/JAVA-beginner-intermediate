
public class Main {
    public static void main(String[] args) {
        int i;
        for (i = 0; i <= 100; i++) {
            if (i >= 30 && i <= 50) {
                continue;
            }
            System.out.println("i= " + i);
        }
    }
}

