public class Find_Missing_Num_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int n = arr.length + 1;
        int totalsum = n * (n+1) / 2;
        int sum = 0;
        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i];
        }
        int missingnum = totalsum -sum;
        System.out.println("The missing number is : " + missingnum);
    }
}
