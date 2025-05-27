package NewJavaPrograme;

public class PositionOfEachCharacterInString {

    public static void main(String[] args) {
        String text="Puttaraja";

        for(int i=0; i<text.length(); i++)
        {
            System.out.println(text.charAt(i)+" Is present in "+(i+1)+ " index ");
        }
    }
}
