package JavaProgramesForInterview;

public class SwapTwoNumbers {

    public static void main(String[] arg) {
        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);

    }
}
