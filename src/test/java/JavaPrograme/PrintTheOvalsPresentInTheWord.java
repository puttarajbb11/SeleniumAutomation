package JavaPrograme;

public class PrintTheOvalsPresentInTheWord {

    public static void main(String[] args) {

        String text = "Karnataka";

        String str = text.toLowerCase();

        char[] ss = str.toCharArray();

        int count = 0;

        for (int i = 0; i < ss.length; i++) {
            if (ss[i] == 'a' || ss[i] == 'e' || ss[i] == 'i' || ss[i] == 'o' || ss[i] == 'u')
            {
                count++;
            }
        }
        System.out.println("Vowels  are " + count);
    }
}
