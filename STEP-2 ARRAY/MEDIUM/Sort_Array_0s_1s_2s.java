public class Sort_Array_0s_1s_2s {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else { 
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
