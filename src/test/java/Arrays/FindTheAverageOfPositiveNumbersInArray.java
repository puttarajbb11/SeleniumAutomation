package Arrays;

public class FindTheAverageOfPositiveNumbersInArray {
    public static void main(String[] args) {

        int[] arr = {-3, -2, 0, -7, 25, 12, -11};

        int sum=0;
        int count=0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>0)
            {
                sum=sum+arr[i];
                count++;
            }
        }
        if(count>0)
        {
            double avg=(double) sum/count;
            System.out.println("Average of the positive number is "+avg);
        }
        else {
            System.out.println("No Positive number in given array");
        }

    }
}
