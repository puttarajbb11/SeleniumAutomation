package JavaPrograme;

import java.util.Scanner;

public class PrimeNumberChecker {


    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) { // If a number num is divisible by a number greater than its square root, then it must also be divisible by a smaller number. Checking up to the square root is sufficient to determine if num is composite.
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