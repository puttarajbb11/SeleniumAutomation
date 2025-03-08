package JavaProgramesForInterview;


import java.util.Scanner;

public class RemoveDuplicateWithoutUsingCollection {
    public static String removeDuplicate(String text) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (sb.indexOf(String.valueOf(ch)) == -1) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String text = sc.nextLine();

        String result = removeDuplicate(text);
        System.out.println(result);
    }
}

