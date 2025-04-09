package StringProgrames;

public class CapjeminStringPrograme {

    public static void main(String[] args) {

        String s="life moving forward in file";

        String target="forward";

        String sb=new StringBuffer(target).reverse().toString();

        System.out.println(s.replace(target,sb));

    }
}
