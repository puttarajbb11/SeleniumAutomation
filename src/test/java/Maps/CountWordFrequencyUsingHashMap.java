package Maps;

import java.util.HashMap;
import java.util.Map;

public class CountWordFrequencyUsingHashMap {

    public static void main(String[] args) {
        String text = "apple banana apple orange banana apple";
        String[] word = text.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String txt : word) {
            map.put(txt, map.getOrDefault(txt, 0) + 1);
        }
        System.out.println(map);
    }
}
