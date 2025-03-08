package StringProgrames;

import java.util.Scanner;

public class CountingTheVowelsInGivenString {

    public static void main(String[] args) {
        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string ");
            String text = sc.nextLine();
            int count = 0;
            String vowels = "aeiouAEIOU";

            for (int i = 0; i < text.length(); i++) {
                if (vowels.indexOf(text.charAt(i)) != -1) {   // Check if the character is in the vowels string
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
