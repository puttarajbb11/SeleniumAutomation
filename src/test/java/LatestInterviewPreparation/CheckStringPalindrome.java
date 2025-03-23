package LatestInterviewPreparation;

import java.util.Scanner;

public class CheckStringPalindrome {
    public static String isPalindrome(String txt) {
        String rev = "";

        for (int i = txt.length() - 1; i >= 0; i--) {
            rev = rev + txt.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            String text = sc.nextLine();

            String rev = isPalindrome(text);

            if (rev.equals(text)) {
                System.out.println("The given string is palindrome");
            } else {
                System.out.println("The given String in not palindrome");
            }
        }
    }
}