package NewJavaPrograme;

import java.util.Scanner;

public class JavaProgrameToCheckStringPalindrome {

    public static String isPalindrome(String txt) {
        String rev = "";
        for (int i = txt.length() - 1; i >= 0; i--) {
            rev = rev + txt.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String txt = sc.nextLine();

        if (isPalindrome(txt).equals(txt)) {
            System.out.println("The given string is Palindrome");
        } else {
            System.out.println("The given string in not palindrome");
        }
    }
}
