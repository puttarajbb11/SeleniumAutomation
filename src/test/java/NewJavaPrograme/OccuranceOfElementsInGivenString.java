package NewJavaPrograme;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OccuranceOfElementsInGivenString {

    public static void main(String[] args) {
        String text = "My name is Puttaraja My name is";
        String[] txt = text.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String s : txt) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        System.out.println(map);
    }
}