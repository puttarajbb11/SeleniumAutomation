package JavaProgramesForInterview;

import java.util.LinkedHashSet;

public class PositionOfEachCharacterWithoutDuplicate {

    public static void main(String[] args) {
        String text = "puttaraja";

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < text.length(); i++) {
            set.add(text.charAt(i));
        }

        for (Character ch : set) {
            for (int i = 0; i < text.length(); i++) {
                if (ch == text.charAt(i)) {
                    System.out.println(ch + " is Present in position " + (i + 1));
                    break;
                }

            }
        }
    }
}
