package StringProgrames;

public class SeparateLettersAndNumbers {

    public static void main(String[] args) {

        //  Java Code Without StringBuilder
        String s = "a1b2c3d4e5";
        String letter = "";
        String digit = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                letter += ch;
            } else if (Character.isDigit(ch)) {
                digit += ch;
            }
        }
        System.out.println(digit + letter);


//    Java Code Using StringBuilder

        StringBuilder letter1 = new StringBuilder();
        StringBuilder digit1 = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            if (Character.isLetter(ch1)) {
                letter1.append(ch1);
            } else if (Character.isDigit(ch1)) {
                digit1.append(ch1);
            }
        }
        System.out.println(letter1.append(digit1));


        //    Java Code Using replaceAll
    }
}
