package Arrays;

import java.util.Arrays;
public class ReversingTheArrayUsingForLoop {
    public static void main(String[] q) {
        int array[] = {1, 2, 3, 4, 5};
        System.out.println("Original Array" + Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("Reversed Array" + Arrays.toString(array));
    }
}