package Maps;

import java.util.HashMap;
import java.util.Map;

public class WordCountInStringUsingMap {

    public static void main(String[] args) {
        String name = "John Doe John Smith Doe John";
        String[] text = name.split("\\s+");

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : text) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + "; " + entry.getValue());
        }
    }
}