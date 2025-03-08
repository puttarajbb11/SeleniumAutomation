package StringProgrames;

import java.util.Scanner;

public class NumberPalindromeExample {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer value");
        int num = sc.nextInt();
        int t = num;
        int rev = 0;

        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num = num / 10;
        }
        if (rev == t) {
            System.out.println(t + " Is a palindrome Number");
        } else {
            System.out.println(t + " Is not a palindrome Number ");
        }
        sc.close();
    }
}
