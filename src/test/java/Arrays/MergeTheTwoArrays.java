package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeTheTwoArrays {

    public static void main(String[] args) {

        Integer[] arr1 = {2, 4, 6, 8};
        Integer[] arr2 = {1, 3, 5, 7};

        List<Integer> list = new ArrayList<>(Arrays.asList(arr2));
        list.addAll(Arrays.asList(arr1));
        Collections.sort(list);

        Integer[] arr3 = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr3));

    }
}
