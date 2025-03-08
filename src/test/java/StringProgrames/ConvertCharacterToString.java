package StringProgrames;

public class ConvertCharacterToString {

    public static void main(String[] q) {
        char[] c = {'G', 'o', 'o', 'd', 'M', 'o', 'r', 'n', 'i', 'n', 'g'};

        String ss = new String(c);
        System.out.println(ss);

        String ee = String.valueOf(c);
        System.out.println(ee);


//        StringBuilder sb = new StringBuilder();
        String s = "";
        for (char ch : c) {
            s += ch;
        }
        System.out.println(s);
    }
}
