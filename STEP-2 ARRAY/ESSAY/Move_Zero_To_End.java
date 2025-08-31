public class Move_Zero_To_End {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n; i++)
        {
            if(arr[i] !=0)
            {
                arr[count++] = arr[i];
            }
        }
        while ((n-count) > 0)
        {
            arr[count++] = 0;
        }
        for(int i=0; i<n; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
