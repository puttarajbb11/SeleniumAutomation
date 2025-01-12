import java.util.Scanner;

public class FibonacciSeries {


    public static void main(String[] args) {
        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number to check fibonacci ");

            int num = sc.nextInt();
            int a = 0;
            int b = 1;

            System.out.println("Fibonacci Series" + a + ", " + b);

            for (int i = 3; i <= num; i++) {
                int next = a + b;
                System.out.print(", " + next);
                a = b;
                b = next;
            }
        }
    }
}