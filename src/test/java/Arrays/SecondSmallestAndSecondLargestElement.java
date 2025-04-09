package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class SecondSmallestAndSecondLargestElement {

    public static void main(String[] args)
    {
        Integer[] arr={15,35,25,19,12,10};
        Arrays.sort(arr);
        System.out.println("Second Smallest element "+arr[1]);
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Second Largest  element "+arr[1]);
    }
}
