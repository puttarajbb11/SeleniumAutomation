package Arrays;

public class AddTwoArrayIfLengthIsDifferent {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8};

        int maxLength = Math.max(arr1.length, arr2.length);

        for (int i = 0; i < maxLength; i++) {
            int val = (i < arr1.length) ? arr1[i] : 0;
            int val1 = (i < arr2.length) ? arr2[i] : 0;
            System.out.println(val + val1);
        }
    }
}
