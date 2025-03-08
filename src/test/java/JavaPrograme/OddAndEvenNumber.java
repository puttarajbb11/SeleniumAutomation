package JavaPrograme;

import java.util.Scanner;

public class OddAndEvenNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer value");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Given number is Even " + num);
        } else {
            System.out.println("Given number is odd " + num);
        }
    }
}
