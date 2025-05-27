package NewJavaPrograme;

import java.util.LinkedHashSet;
import java.util.Arrays;

public class FindTheDuplicatStringCountInTheString {

    public static void main(String[] args) {
        String text = "my name is puttaraja my name is puttaraja";
        String[] spt = text.split(" ");
        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(spt));

        for(String word2:set)
        {
            int count=0;

            for(String word3:spt)
            {
                if(word3.equals(word2))
                {
                    count++;
                }
            }
            System.out.println(word2+" "+count);
        }
    }
}
