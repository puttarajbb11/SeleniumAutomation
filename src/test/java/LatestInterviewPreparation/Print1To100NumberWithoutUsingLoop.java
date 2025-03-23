package LatestInterviewPreparation;

public class Print1To100NumberWithoutUsingLoop {
    public static void printNumber(int num) {
        if (num <= 100) {
            System.out.print(num + " ");
            num++;
            printNumber(num);
        }
    }

    public static void main(String[] args) {

        printNumber(1);
    }
}
