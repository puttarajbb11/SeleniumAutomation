package JavaProgramesForInterview;

public class CountTheOccurrenceOfCharacterInString {

    public static void main(String[] a) {
        String text = "karanataka";
        int count = 0;
        char ch = 'a';

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println(count);
    }
}
