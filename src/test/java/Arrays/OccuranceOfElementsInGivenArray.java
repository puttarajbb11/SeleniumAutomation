package Arrays;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfElementsInGivenArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4, 4, 5};

        Map<Integer, Integer> map = new HashMap<>();
        for (Integer e : arr) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }
        System.out.println(map);
    }
}
