import java.util.Arrays;

public class Merge_Overlapping_Subintervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][];
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[][] merged = new int[intervals.length][2];
        int index = 0;
        merged[index] = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= merged[index][1]) {
                merged[index][1] = Math.max(merged[index][1], intervals[i][1]);
            } else {
                index++;
                merged[index] = intervals[i];
            }
        }
        return Arrays.copyOf(merged, index + 1);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 4}, {5, 7}, {6, 8}};
        int[][] mergedIntervals = merge(intervals);

        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
