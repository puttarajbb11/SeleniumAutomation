package JavaPrograme_1;

import java.util.Scanner;

public class DoubleCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string ");
        String input = sc.nextLine();
        sc.close();

        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            sb.append(c).append(c);
        }
        System.out.println("Output " + sb);
    }
}
