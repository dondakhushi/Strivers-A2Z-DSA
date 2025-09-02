public class Majority_Element {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int n = arr.length;
        int count = 0;
        int candidate = -1;

        for(int i=0; i<n; i++)
        {
            if(count == 0)
            {
                candidate = arr[i];
            }
            if(arr[i] == candidate)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        System.out.println("Majority Element is : " + candidate);
    }
}
