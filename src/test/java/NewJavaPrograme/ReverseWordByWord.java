package NewJavaPrograme;

public class ReverseWordByWord {

    public static void main(String[] args) {
        String name = "Puttaraja Baradeli";
        String[] spt = name.split(" ");
        String rev = "";

        for (int i = 0; i < spt.length; i++) {
            String word = spt[i];

            for (int j = word.length() - 1; j >= 0; j--) {
                rev += word.charAt(j);
            }
            if (i != spt.length - 1) {
                rev += " ";
            }
        }
        System.out.println(rev);
    }
}
