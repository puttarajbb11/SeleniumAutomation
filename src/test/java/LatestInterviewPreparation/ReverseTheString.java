package LatestInterviewPreparation;

public class ReverseTheString {

    public static void main(String[] args) {
        String text = "HelloWorld";

        String rev = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            rev = rev + text.charAt(i);
        }
        System.out.println(rev);
    }
}
