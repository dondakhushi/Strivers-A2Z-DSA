public class Find_The_Union {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] union = new int[n1 + n2];
        int k = 0;
        for(int i=0; i<n1; i++)
        {
            union[k++] = arr1[i];
        }
        for(int i=0; i<n2; i++)
        {
            boolean found = false;
            for(int j=0; j<n1; j++)
            {
                if(arr2[i] == arr1[j])
                {
                    found = true;
                    break;
                }
            }
            if(!found)
            {
                union[k++] = arr2[i];
            }
        }
        System.out.println("The union of the two arrays is :" + " " + k);
    }
}
