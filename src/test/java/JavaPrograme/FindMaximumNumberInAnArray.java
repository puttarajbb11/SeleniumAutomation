package JavaPrograme;

public class FindMaximumNumberInAnArray {

    public static void main(String[] args) {
        int[] arr = {10, 4, 9, 8, 12, 67, 8, 1, 100};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}