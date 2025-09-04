import java.util.Arrays;

public class Merge_two_sorted_arrays_without_extra_space {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        int n = arr1.length;
        int m = arr2.length;
        int i = 0, j = 0, k = n -1;
        while(i <= k && j < m ) 
        {
            if(arr1[i] < arr2[j])
            {
                i++;
            }
            else
            {
                int temp = arr1[k];
                arr1[k] = arr2[j];
                arr2[j] = temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("Array 1 after merging : " + Arrays.toString(arr1));
        
    }
}
