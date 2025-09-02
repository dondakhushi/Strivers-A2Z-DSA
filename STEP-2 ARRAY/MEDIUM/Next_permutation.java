public class Next_permutation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int i = arr.length -2;
        while(i >= 0 && arr[i] >= arr[i+1])
        {
            i--;
        }
        if(i >= 0)
        {
            int j = arr.length - 1;
            while(arr[j] <= arr[i])
            {
                j--;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        int start = i +1;
        int end = arr.length -1;
        while (start <end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int k=0 ; k<arr.length; k++)
        {
            System.out.println(arr[k] + " ");
        } 
    }
}
