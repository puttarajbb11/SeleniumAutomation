package LatestInterviewPreparation;

import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrimeNumber(int num) {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if (isPrimeNumber(num)) {
            System.out.println("The given number is prime");
        } else {
            System.out.println("The given number is not prime number ");
        }
    }
}
