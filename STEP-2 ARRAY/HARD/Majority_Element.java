package HARD;

public class Majority_Element {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        System.out.println(candidate);
    }
}
