package JavaPrograme;

public class ConvertFirstLetterOfEachWordToUpperCase {

    public static void main(String[] args) {

        String text = "java is program language";
        char[] ch = text.toCharArray();
        boolean space = true;

        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetter(ch[i])) {
                if (space) {
                    ch[i] = Character.toUpperCase(ch[i]);
                    space = false;
                }
            } else {
                space = true;
            }
        }
        text = String.valueOf(ch);
        System.out.println(text);
    }
}
