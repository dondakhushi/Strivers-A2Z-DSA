public class Second_Largest_Element {
    public static void main(String[] args) {
        int[] arr= {12, 35, 1, 10, 34, 1};
        int n = arr.length;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i=0; i<n; i++)
        {
            if(arr[i]>first)
            {
                second = first;
                first = arr[i];
            }
            else if (arr[i]>second && arr[i]!=first)
            {
                second = arr[i];
                if(second == Integer.MIN_VALUE)
                {
                    System.out.println("No second largest element");
                }
                else {
                    System.out.println("The second largeset element is " + second);
                }
            }
        }
    }
 }
    

