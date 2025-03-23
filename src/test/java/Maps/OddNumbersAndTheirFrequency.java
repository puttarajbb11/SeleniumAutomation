package Maps;
import java.util.*;
import java.util.stream.Collectors;

public class OddNumbersAndTheirFrequency {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 4, 5, 6, 7, 7, 5,8);
        System.out.println(countOfOddNumber(intList));
    }

    private static Map<Integer, Long> countOfOddNumber(List<Integer> intList) {
        List<Integer> oddList = intList.stream()
                .filter(e1 -> e1 % 2 != 0)
                .toList();

        return oddList.stream()
                .collect(Collectors.groupingBy(e1 -> e1, Collectors.counting()));
    }
}
