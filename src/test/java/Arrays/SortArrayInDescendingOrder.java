package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayInDescendingOrder {

    public static void main(String[] a) {
        Integer[] arr = {10, 20, 15, 35, 30, 40, 45};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
