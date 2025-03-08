package JavaProgramesForInterview;

import java.util.Scanner;

public class GivenNumberIsPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int t = num;
        int rev = 0;

        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num = num / 10;
        }
        if (rev == t) {
            System.out.println("given number is palindrome");
        } else {
            System.out.println("Given number is not palindrome");
        }
    }
}
