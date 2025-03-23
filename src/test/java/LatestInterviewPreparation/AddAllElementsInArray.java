package LatestInterviewPreparation;

public class AddAllElementsInArray {

    public static void main(String[] a) {
        int[] arr = {11, 25, 35, 46, 10, 15, 10};
        int total = arr[arr.length - 1] + arr[arr.length - 2] + arr[arr.length - 3];
        int sum = 0;

        for (Integer e : arr) {
            sum = sum + e;
        }
        System.out.println(sum);
        System.out.println("total " + total);
    }
}
