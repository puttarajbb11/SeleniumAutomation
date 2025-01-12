package JavaPrograme;

public class JavaProgramNumberPattern {

    public static void main(String[] args) {

        int num = 1;
        int i, j;

        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

    }
}
