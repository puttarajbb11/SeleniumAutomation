package Arrays;

public class AddTwoArraysIntoSingle {
    public static void main(String[] args) {
        int[] arr1={1,3,5,7};
        int[] arr2={2,4,6,8};

        int length=arr1.length;
        if(arr1.length<arr2.length)
        {
            length=arr2.length;
        }

        for (int i=0; i<length; i++)
        {
            System.out.println(arr1[i]+arr2[i]);
        }
    }
}
