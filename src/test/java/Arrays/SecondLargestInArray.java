package Arrays;

import java.util.Arrays;

public class SecondLargestInArray {

    public static void main(String[] args) {
        int[] arr = {12, 10, 45, 87,10,100};
        Arrays.sort(arr);
        System.out.println("Second Largest ---> " + arr[arr.length - 2]);
    }
}
