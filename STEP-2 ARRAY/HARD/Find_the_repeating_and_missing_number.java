public class Find_the_repeating_and_missing_number {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3};
        int n = arr.length;
        int xor = 0;
        for(int i=0; i<n; i++)
        {
            xor = xor ^ arr[i];
            xor = xor ^ (i+1);
        }
        int setBit = xor & ~(xor - 1);
        int x = 0;
        int y = 0;
        for(int i=0; i<n; i++)
        {
            if((arr[i] & setBit) == 0)
            {
                x = x^ arr[i];
            }
            else{
                y = y ^ arr[i];
            }
            if(((i+1) & setBit) == 0)
            {
                x = x^ (i+1);
            }
            else{
                y = y ^ arr[i];
            }
        }
        int count = 0;
        for(int i =0; i<n; i++)
        {
            if(arr[i] == x) count++;
        }
        if(count == 2)
        {
            System.out.println("Repeating number is " + x);
            System.out.println("Missing number is " + y);
        }
        else{
            System.out.println("Repeating number is " + y);
            System.out.println("Missing number is " + x);
        }

    }
}
