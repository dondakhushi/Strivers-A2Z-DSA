import java.util.HashMap;
import java.util.Map;

public class Largest_Subarray_with_0_Sum {
    public static int largestSubarrayWith0Sum(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) {
                maxLength = i + 1;
            } else {
                if (map.containsKey(sum)) {
                    maxLength = Math.max(maxLength, i - map.get(sum));
                } else {
                    map.put(sum, i);
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(largestSubarrayWith0Sum(arr)); // Output: 5
    }
}

