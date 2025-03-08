package JavaProgramesForInterview;

import java.util.Scanner;

public class CheckForOddAndEven {

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("The given number is Even");
        } else {
            System.out.println("The give number is odd");
        }
    }
}