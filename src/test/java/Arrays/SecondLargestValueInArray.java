package Arrays;

public class SecondLargestValueInArray {


    public static void main(String[] args) {
        int[] arr = {7, 5, 2, 4, 1, 9, 6, 8};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int ele: arr)
        {
            System.out.println(ele);
        }
        System.out.println(arr[1]);
        System.out.println(arr[arr.length - 2]);
    }
}