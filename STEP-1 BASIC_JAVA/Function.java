public class Function {
    public static int maxSubArray(int[] arr) {
        int mansum = Integer.MIN_VALUE;
        int cursum = 0;

        for (int i = 0; i < arr.length; i++) {
            cursum += arr[i];
            if (cursum > mansum) {
                mansum = cursum;
            }
            if (cursum < 0) {
                cursum = 0;
            }
        }
        return mansum; // ✅ added return
    }

    public static void main(String[] args) {
        int[] arr = {-1, -2, -3};
        System.out.println(maxSubArray(arr)); 
    }
}
