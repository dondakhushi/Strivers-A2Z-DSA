import java.util.*;

public class Count_number_of_subarrays_with_given_xor_K {
    public static int countSubArraysWithXorK(int[] arr, int k) {
        int count = 0;
        int xor = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];

            // Case 1: if prefix XOR itself equals k
            if (xor == k) {
                count++;
            }

            // Case 2: check if (xor ^ k) exists in map
            int y = xor ^ k;
            if (map.containsKey(y)) {
                count += map.get(y);
            }

            // Store frequency of current prefix XOR
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println(countSubArraysWithXorK(arr, k)); // Output: 4
    }
}
