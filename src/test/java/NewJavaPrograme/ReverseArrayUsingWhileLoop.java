package NewJavaPrograme;

import java.util.Arrays;

public class ReverseArrayUsingWhileLoop {

    public static void main(String[] args) {
        int[] arr = {8, 7, 6, 5, 4, 3, 2, 1};

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
        System.out.println(Arrays.toString(arr));
    }
}