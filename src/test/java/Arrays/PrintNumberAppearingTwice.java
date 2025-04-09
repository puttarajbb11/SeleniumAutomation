package Arrays;

import java.util.HashMap;
import java.util.Map;

public class PrintNumberAppearingTwice {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 8, 1, 2, 3};

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                System.out.println(entry.getKey());
            }
        }
    }
}
