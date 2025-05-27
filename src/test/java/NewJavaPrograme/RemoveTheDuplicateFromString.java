package NewJavaPrograme;

import java.util.LinkedHashSet;

public class RemoveTheDuplicateFromString {
    public static void main(String[] args) {
        String txt="karnataka";

        LinkedHashSet<Character> set=new LinkedHashSet<>();

        for(int i=0; i<txt.length(); i++)
        {
            set.add(txt.charAt(i));
        }

        for(Character ch:set)
        {
            System.out.print(ch);
        }
    }
}
