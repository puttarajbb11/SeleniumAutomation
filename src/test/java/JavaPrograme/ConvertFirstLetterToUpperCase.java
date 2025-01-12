package JavaPrograme;

public class ConvertFirstLetterToUpperCase {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1));
    }
}