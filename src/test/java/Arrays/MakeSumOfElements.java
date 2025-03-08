package Arrays;

public class MakeSumOfElements {

    public static void main(String[] args) {

        int[] arr = {2, 5, 9, 4, 5};

        int sum = 0;

        for (int e : arr) {
            sum = sum + e;
        }
        System.out.println(sum);
    }
}
