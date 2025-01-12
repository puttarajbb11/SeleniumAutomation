package JavaPrograme;

public class PrintPositionOfEachCharacterInGivenCharacter {

    public static void main(String[] args) {

        String txt="software";

        for(int i=0; i<txt.length(); i++)
        {
            System.out.println(txt.charAt(i)+" is Present on "+ (i+1));
        }
    }
}