package Maps;

import java.util.HashMap;
import java.util.Map;

public class CommonWordAndCountInString {

        public static void main(String[] args) {
            String text = "This is a sample this text with some sample words. This Sample words appear multiple times in the text.";

            // Convert text to lowercase and remove punctuation
            text = text.toLowerCase().replaceAll("[^a-zA-Z ]", "");

            // Split text into words
            String[] words = text.split("\\s+");

            // Use a HashMap to count occurrences of each word
            Map<String, Integer> wordCount = new HashMap<>();

            for (String word : words) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }

            // Find the most common word
            String mostCommonWord = "";
            int maxCount = 0;

            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                if (entry.getValue() > maxCount) {
                    mostCommonWord = entry.getKey();
                    maxCount = entry.getValue();
                }
            }

            System.out.println("Most Common Word: " + mostCommonWord);
            System.out.println("Count: " + maxCount);
        }
    }

