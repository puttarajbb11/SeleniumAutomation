package JavaProgramesForInterview;


import java.util.HashMap;
import java.util.Map;

public class CountWordFrequencyUsingHashMap {
    public static void main(String[] args) {


        String text = "apple ball banana apple ball banana";
        String[] spt = text.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String txt : spt) {
            map.put(txt, map.getOrDefault(txt, 0) + 1);
        }
    }
}
