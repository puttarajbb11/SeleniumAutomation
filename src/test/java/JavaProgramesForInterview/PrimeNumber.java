package JavaProgramesForInterview;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        boolean t = isPrimeNumber(num);
        if (t == true) {
            System.out.println("Given Number is Prime number");
        } else if (t == false) {
            System.out.println("Given Number is not Prime number");
        }
    }

    private static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
