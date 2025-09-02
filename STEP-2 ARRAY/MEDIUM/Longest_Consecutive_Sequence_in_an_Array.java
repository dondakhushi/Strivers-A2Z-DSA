import java.util.HashSet;
public class Longest_Consecutive_Sequence_in_an_Array {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        HashSet<Integer> numset = new HashSet<>();
        for(int num : nums)
        {
            numset.add(num);
        }
        int longestConsecutive = 0;
        for(int num : nums)
        {
            if(!numset.contains(num - 1))
            {
                int currentNum = num;
                int currentNumStreak = 1;
                while(numset.contains(currentNum + 1))
                {
                    currentNum += 1;
                    currentNumStreak += 1;
                    longestConsecutive = Math.max(longestConsecutive, currentNumStreak);
                }
                System.out.println(longestConsecutive);
            }
        }

    }
}