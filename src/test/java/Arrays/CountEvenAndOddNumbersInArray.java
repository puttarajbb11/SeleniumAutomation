package Arrays;

public class CountEvenAndOddNumbersInArray {

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 6, 7, 8};

        int evenNumber = 0;
        int oddNumber = 0;

        for (int e : arr) {
            if (e % 2 == 0) {
                evenNumber++;
            } else {
                oddNumber++;
            }
        }
        System.out.println("Even Number " + evenNumber);
        System.out.println("Odd Number " + oddNumber);

    }
}
