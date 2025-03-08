package JavaProgramesForInterview;

import java.util.Scanner;

public class FindTheFactorialOfNumber {

    public static int factorial(int num)
    {
        int f=1;
        for(int i=2; i<=num; i++)
        {
            f=f*i;
        }
        return f;
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int result=factorial(num);
        System.out.println(result);
    }
}
