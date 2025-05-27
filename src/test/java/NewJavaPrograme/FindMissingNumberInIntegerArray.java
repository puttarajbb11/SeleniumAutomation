package NewJavaPrograme;


public class FindMissingNumberInIntegerArray {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,6};
        int n=6;

        int expectedSum=n*(n+1)/2;
        int acutalSum=0;

        for(int num:arr)
        {
            acutalSum+=num;
        }

        int missing=expectedSum-acutalSum;
        System.out.println(missing);

    }
}
