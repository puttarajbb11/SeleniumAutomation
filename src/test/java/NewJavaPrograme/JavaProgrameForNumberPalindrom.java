package NewJavaPrograme;

import java.util.Scanner;

public class JavaProgrameForNumberPalindrom {

    public static int isPalindrome(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num = num / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int t=num;

        if (isPalindrome(num) == t) {
            System.out.println("The given number is Palindrome");
        } else {
            System.out.println("The Given number is not palindrome");
        }
    }
}
