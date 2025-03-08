package JavaPrograme;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input value");
        int input = sc.nextInt();
//
        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 2; i < input; i++) {
            c = a + b;
            if (c < input) {
                System.out.println(c + " ");
                a = b;
                b = c;
            }
        }

    }
}
