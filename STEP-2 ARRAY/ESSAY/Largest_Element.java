public class Largest_Element {
    public static void main(String[] args) {
        int[] arr = {34, 67, 23, 86, 12, 90, 45};
        int largest = arr[0];
        for (int i=0; i<arr.length; i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
        }
        System.out.println("The largerst element in the array is " + largest);
        
    }
}
