package JavaProgramesForInterview;

import java.util.Scanner;

public class SumOfDigit {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

        int sum=sumOfDigit(num);
        System.out.println(sum);

    }

    private static int sumOfDigit(int num) {

        int sum = 0;
      while (num>0){
            int d = num % 10;
           sum=sum+d;
           num=num/10;
        }
        return sum;
    }
}
