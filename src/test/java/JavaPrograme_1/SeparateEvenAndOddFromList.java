package JavaPrograme_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateEvenAndOddFromList {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 0);

        Map<Boolean, List<Integer>> partitioned = list.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println("Even Numbers: " + partitioned.get(true));
        System.out.println("Odd Numbers: " + partitioned.get(false));

    }
}
