public class Remove_Duplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int n= arr.length;
        int[] temp = new int [n];
        int j=0;
        for(int i=0; i<n-1; i++)
        {
            if(arr[i] != arr[i+1])
            {
                temp[i++] = arr[i];
            }
        }
        temp[j++] =arr[n-1];
        for(int i=0; i<j; i++)
        {
            arr[i] = temp[i];
        }
        for(int i=0; i<j; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
