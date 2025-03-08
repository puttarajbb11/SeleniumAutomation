package StringProgrames;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class FindTheDuplicatStringCountInTheString {

    public static void main(String[] args) {
        String text = "my name is puttaraja my name is puttaraja ";
        String[] str = text.split(" ");

        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(str));
        // LinkedHashSet ensures that only unique words are stored while preserving the original order.

        for (String word2 : set) {
            int count = 0;
            for (String word3 : str) {
                if (word3.equals(word2)) {
                    count++;
                }
            }
            System.out.println(word2 + count);
        }
//        The outer loop iterates over unique words stored in set.
//        The inner loop iterates over all words in str and counts occurrences of each unique word.

    }
}
