package NewJavaPrograme;

public class LongestWordInString {

    public static void main(String[] args) {
        String sentence = "I love programming in Java";
        String[] txt = sentence.split(" ");
        String longest = "";

        for (String word : txt) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println(longest);
    }
}