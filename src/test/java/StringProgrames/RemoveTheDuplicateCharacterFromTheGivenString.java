package StringProgrames;

import java.util.LinkedHashSet;

public class RemoveTheDuplicateCharacterFromTheGivenString {

    public static void main(String[] args) {
        String text = "karanataka";
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < text.length() - 1; i++) {
            set.add(text.charAt(i));
        }

        for (Character ch : set) {
            System.out.print(ch + " ");
        }
    }
}
