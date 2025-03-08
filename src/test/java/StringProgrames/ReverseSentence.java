package StringProgrames;

public class ReverseSentence {

    public static void main(String[] args) {
        String txt = "My name is Puttaraja";
        String[] sl = txt.split(" ");

        for (int i = sl.length - 1; i >= 0; i--) {
            System.out.println(sl[i] + " ");
        }
    }
}
