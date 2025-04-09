package JavaPrograme_1;

public class SeparateNumAndAlphabet {
    public static void main(String[] args) {
        String s = "ABC-2025";

        String[] d = s.split("-");

        for (int i = 0; i < d.length; i++) {
            System.out.println("[" + d[i] + "]");
        }
    }
}
