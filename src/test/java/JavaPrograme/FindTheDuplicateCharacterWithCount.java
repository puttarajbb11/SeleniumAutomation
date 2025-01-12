package JavaPrograme;

import java.util.LinkedHashSet;

public class FindTheDuplicateCharacterWithCount {

    public static void main(String[] args) {

        String string = "karnataka";

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < string.length(); i++) {
            set.add(string.charAt(i));
        }

        System.out.println("printing set ---> " + set);

        for (Character ch : set) {
            int count = 0;

            for (int i = 0; i < string.length(); i++) {
                if (ch.equals(string.charAt(i))) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(ch + " is present " + count);
            }
        }
    }
}