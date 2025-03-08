package JavaProgramesForInterview;

public class ReverseTheString {

    public static void main(String[] a) {
        String txt = "puttaraja";
        String rev = "";

        for (int i = txt.length()-1; i >= 0; i--) {
            rev = rev + txt.charAt(i);
        }
        System.out.println(rev);
    }
}
