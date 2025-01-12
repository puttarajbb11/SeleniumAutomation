package JavaPrograme;

public class PrintNumberUpTo100WithUsingLoop {

    private static void printNUmber(int num) {
        if (num <= 100) {
            System.out.println(num + " ");
            num++;
            printNUmber(num);
        }
    }

    public static void main(String[] args) {
        printNUmber(1);
    }
}