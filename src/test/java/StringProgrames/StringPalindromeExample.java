package StringProgrames;

import java.util.Scanner;

public class StringPalindromeExample {

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        String txt = sc.nextLine();
        String rev = "";

        for (int i = txt.length() - 1; i >= 0; i--) {
            rev = rev + txt.charAt(i);
        }
        if (txt.equals(rev)) {
            System.out.println("Given input is palindrome " + rev);
        } else {
            System.out.println("Given input is not a  palindrome " + rev);
        }

        StringBuffer sb = new StringBuffer(txt);
        String data = sb.reverse().toString();
        if (txt.equals(data)) {
            System.out.println("Given input is palindrome " + data);
        } else {
            System.out.println("Given input is not a  palindrome " + data);
        }

    }
}
