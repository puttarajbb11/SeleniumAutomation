package Arrays;

import java.util.*;

public class ReverseArrayUsingWhileLoop {

    public static void main(String[] a) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original Array" + Arrays.toString(array));

        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
        System.out.println("Reversed Array " + Arrays.toString(array));
    }
}
