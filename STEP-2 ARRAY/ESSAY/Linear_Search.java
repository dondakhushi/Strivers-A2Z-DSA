public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {23, 45, 12, 67, 34, 89};
        int target = 67;
        boolean fount = false;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == target)
            {
                System.out.println("Element fount at index " + i);
                fount = true;
                break;
            }
        }
        if(!fount)
        {
            System.out.println("Element not found in the array");
        }
    }
}
