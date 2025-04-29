package Arrays;

import java.util.Arrays;
public class RemoveDuplicateInArray {
    public static void main(String[] args) {

        int[] arr = {3, 5, 8, 0, 3, 5, 8, -10, 4, -4};
        int length = removeDuplicate(arr);

        // Print elements in descending order
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicate(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1) return n;

        Arrays.sort(arr); // Step 1: Sort array in ascending order
        int j = 0;

        // Step 2: Remove duplicates
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1]; // Fix: Store the last unique element

        reverseArray(arr, j); // Step 3: Reverse array to get descending order
        return j;
    }

    public static void reverseArray(int[] arr, int length) {
        int start = 0, end = length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
