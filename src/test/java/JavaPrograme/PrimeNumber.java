package JavaPrograme;

import java.util.Scanner;

public class PrimeNumber {

    public static boolean primeNumber(int num)
    {
        for(int i=2; i<num/2; i++)
        {
            if(num%i==0)
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer number");
        int num=sc.nextInt();
        boolean pn=primeNumber(num);

        if(pn==true)
        {
            System.out.println("Given Number is Prime");
        }else
        {
            System.out.println("Given number is not prime ");
        }
    }
}
