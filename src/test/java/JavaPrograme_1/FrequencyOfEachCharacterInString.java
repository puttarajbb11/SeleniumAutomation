package JavaPrograme_1;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacterInString {

    public static void main(String[] args) {
        String txt = "programming";

        Map<Character, Long> ele = txt.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Character frequency" + ele);
    }
}
