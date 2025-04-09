package StringProgrames;

public class ReverseString {

    public static void main(String[] args)
    {
        String s="I Love Java";

        String[] txt=s.split(" ");


        StringBuilder result=new StringBuilder();

        for(int i=txt.length-1; i>=0; i--)
        {
            StringBuilder reverseword=new StringBuilder(txt[i]);
            result.append(reverseword.reverse()).append(" ");
        }
        System.out.print(result.toString().trim());

    }

}

