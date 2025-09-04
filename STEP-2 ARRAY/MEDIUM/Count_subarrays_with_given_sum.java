public class Count_subarrays_with_given_sum {
    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        int targetSum = -10;
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            int currentSum = 0;
            for(int j = i; j < arr.length; j++)
            {
                currentSum += arr[j];
                if(currentSum == targetSum)
                {
                    count++;
                }
            }
        }
        System.out.println("Count of subarrays with given sum : " + count);
    }
}
