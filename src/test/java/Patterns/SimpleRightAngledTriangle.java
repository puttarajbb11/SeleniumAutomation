package Patterns;

import java.util.Scanner;

public class SimpleRightAngledTriangle {

    public static void main(String[] a) {
        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number");
            int num = sc.nextInt();

            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
        }
    }
}