package JavaProgramesForInterview;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;

        while (c <=num) {
            c = a + b;
            if (c <= num) {
                System.out.println(c);
                a = b;
                b = c;
            }
        }
    }
}
