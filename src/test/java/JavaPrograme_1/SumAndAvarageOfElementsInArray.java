package JavaPrograme_1;

import java.util.Arrays;
import java.util.OptionalDouble;

public class SumAndAvarageOfElementsInArray {

    public static void main(String[] args) {

        int[] arr = {4, 8, 2, 12, 5, 8};

        int sum = Arrays.stream(arr).sum();
        System.out.println("Sum of all elements " + sum);

        double avg = Arrays.stream(arr).average().getAsDouble();
        System.out.println("Average of array " + avg);
    }
}
