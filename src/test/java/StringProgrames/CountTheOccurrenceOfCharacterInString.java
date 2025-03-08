package StringProgrames;

public class CountTheOccurrenceOfCharacterInString {

    public static void main(String[] args) {
        String txt = "karanataka";
        int count = 0;
        char ch = 'a';

        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("The character "+ch+" Found "+count+" Times");
    }
}
