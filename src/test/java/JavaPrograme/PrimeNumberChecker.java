package JavaPrograme;

import java.util.Scanner;

public class PrimeNumberChecker {


    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number to check the Prime");
            int num = sc.nextInt();

            if (isPrime(num)) {
                System.out.println(num + "  --> is a Prime Number ");
            } else {
                System.out.println(num + "--> Is not a prime number ");
            }
        }
    }
}