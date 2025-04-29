package Maps;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterAndThereFrequency {

    public static void main(String[] args) {
        List<Character> charList = Arrays.asList('a', 'b', 'c', 'd', 'd', 'e', 'f', 'g', 'g', 'e');
        System.out.println(countOfOddAsciiCharacters(charList));
    }

    private static Map<Character, Long> countOfOddAsciiCharacters(List<Character> charList) {
        List<Character> oddAsciiList = charList.stream()
                .filter(ch -> (int) ch % 2 != 0)  // Check if ASCII value is odd
                .toList();

        return oddAsciiList.stream()
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
    }
}