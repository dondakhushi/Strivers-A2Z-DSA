public class Longest_Subarray_With_Sum_K {
    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3};
        int k = 3;
        int maxlen = 0;
        for(int i=0; i<arr.length; i++)
        {
            int sum = 0;
            for(int j=i; j<arr.length; j++)
            {
                sum += arr[j];
                if(sum == k)
                {
                    int len = j - i + 1;
                    if(len > maxlen)
                    {
                        maxlen = len;
                        System.out.println("The longest subarray with sum " + k + " is from index " + i + " to " + j) ;
                        System.out.println("The length of thr longest subarray is : " + maxlen);
                    }
                }
            }
        }
    }
}
