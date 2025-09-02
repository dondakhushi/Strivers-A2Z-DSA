public class Print_subarray_with_maximum_subarray_sum {
    public static void main(String[] args) {
        int[] arr = {-1, -2, -3};
        int mansum = Integer.MIN_VALUE;
        int cursum = 0;
        int start = 0;
        int end = 0;
        int s = 0;
        for(int i=0; i<arr.length; i++)
        {
            cursum += arr[i];
            if(cursum > mansum)
            {
                mansum = cursum;
                start = s;
                end = i;
            }
            if(cursum < 0)
            {
                cursum = 0;
                s = i + 1;
            }
        }
        System.out.println("Maximum Subarray Sum : " + mansum);
        System.out.print("Subarray : ");
        for(int i = start; i <= end; i++)
        {
            System.out.println(arr[i] + " ");
        }
    }
}
