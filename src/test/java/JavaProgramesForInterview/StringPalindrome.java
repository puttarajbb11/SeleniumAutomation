package JavaProgramesForInterview;

import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        String text = sc.nextLine();
        String rev = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            rev = rev + text.charAt(i);
        }
        if(rev.equals(text))
        {
            System.out.println("Given string is palindrome");
        }
        else {
            System.out.println("Given string is not palindrome");
        }

    }

}
