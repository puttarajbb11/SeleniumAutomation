package JavaProgramesForInterview;

import java.util.Scanner;

public class CountingTheVowelsInGivenString {

    public static void main(String[] args) {

        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the text");
            String input = sc.nextLine();
            int count = 0;

            String vowels = "aeiouAEIOU";

            for (int i = 0; i < input.length(); i++) {
                if (vowels.indexOf(input.charAt(i)) != -1) {
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
