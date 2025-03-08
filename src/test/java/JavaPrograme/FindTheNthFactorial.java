package JavaPrograme;

import java.util.Scanner;

public class FindTheNthFactorial {
    public static int findFactorial(int num) {
        int f = 1;
        while (num > 1) {
            f = f * num;
            num--;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer Number");
        int num = sc.nextInt();
        int n = findFactorial(num);
        System.out.println(n);
    }


}
