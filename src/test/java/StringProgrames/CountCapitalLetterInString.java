package StringProgrames;

public class CountCapitalLetterInString {

    public static void main(String[] args) {
        String text = "I Am AutomatioN Test Engineer";
        int count = 0;

        for (char ch : text.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
