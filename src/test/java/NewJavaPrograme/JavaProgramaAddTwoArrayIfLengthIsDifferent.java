package NewJavaPrograme;

public class JavaProgramaAddTwoArrayIfLengthIsDifferent {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int[] arr1 = {1, 3, 5, 7, 9};

        int length = Math.max(arr.length, arr1.length);

        for (int i = 0; i < length; i++) {
            int val = (i < arr.length) ? arr[i] : 0;
            int val1 = (i < arr1.length) ? arr1[i] : 0;
            System.out.print(val + val1+" ");
        }
    }
}