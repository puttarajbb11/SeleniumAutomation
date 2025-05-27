package NewJavaPrograme;


public class CountOddAndEvenNumberInArray {

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 4, 7, 6, 8, 9, 10,11};
        int oddNumber = 0;
        int evenNumber = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenNumber++;
            } else {
                oddNumber++;
            }
        }
        System.out.println(oddNumber + " Odd Number Count");
        System.out.println(evenNumber + " even Number count");
    }
}
