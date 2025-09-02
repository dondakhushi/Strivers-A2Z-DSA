public class Rearrange_the_array_in_alternating_positive_and_negative_item {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -1, 4};
        int[] result = new int[arr.length];
        int posIndex = 0;
        int negIndex = 1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] >= 0)
            {
                if(posIndex < arr.length)
                {
                    result[posIndex] = arr[i];
                    posIndex += 2;
                }
            }
            else
            {
                if(negIndex < arr.length)
                {
                    result[negIndex] = arr[i];
                    negIndex += 2;
                }
            }
        }
        for(int i=0; i<result.length; i++)
        {
            System.out.println(result[i] + " ");
        }
    }
}
