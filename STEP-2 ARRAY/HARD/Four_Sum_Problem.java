import java.util.*;
public class Four_Sum_Problem {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n-3; i++)
        {
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j<n-2; j++)
            {
                if(j>i+1 && nums[j] == nums[j-1]) continue;
                int left = j+1;
                int right = n-1;
                while(left < right)
                {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum == target)
                    {
                        result.add(Arrays.asList(nums[i] ,nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                    }
                }
            }
        }
        return result;

    }
    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;
        System.out.println(fourSum(arr, target));
    }
}
