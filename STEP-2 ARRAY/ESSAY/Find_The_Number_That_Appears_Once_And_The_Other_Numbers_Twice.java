public class Find_The_Number_That_Appears_Once_And_The_Other_Numbers_Twice {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        int result = 0;
        for(int i=0; i<arr.length; i++)
        {
            result = result ^ arr[i];
        }
        System.out.println("The number that appears once is : " + result);
    }
}
