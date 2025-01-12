package JavaPrograme;

import java.util.*;

public class FindTheDuplicateValuesUsingTheHashSet {

    public static void main(String[] args) {

        int[] number = {3, 8, 1, 4, 9, 0, 1, 3, 5, 4};

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < number.length; i++) {
            if (!set.add(number[i])) {
                System.out.println("The Duplicate number is ---->" + number[i]);
            }
        }

        // Find duplicate using the Array.Sort()

        int[] number1 = {3, 8, 1, 4, 9, 0, 1, 3, 5, 4};

        Arrays.sort(number1);

        for (int i = 1; i < number1.length; i++) {
            if (number1[i] == number1[i - 1]) {
                System.out.println("The Duplicate number is ---->" + number1[i]);
            }
        }

        // Find duplicate using the map

        int[] number2 = {3, 8, 1, 4, 9, 0, 1, 3, 5, 4};

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : number2) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("The Duplicate number is ---->" + entry.getKey());
            }
        }

    }
}
