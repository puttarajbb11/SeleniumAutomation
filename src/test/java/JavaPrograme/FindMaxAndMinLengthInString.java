package JavaPrograme;

public class FindMaxAndMinLengthInString {
  public static String s="Puttaraja Basavaraja Baradeli";

    public static void main(String[] args) {
        String[] srt=s.split(" ");
          String max=srt[0];

          for (int i=0; i<srt.length; i++)
          {
              if(srt[i].length()<max.length())
              {
                  max=srt[i];
              }
          }
        System.out.println(max);
    }
}