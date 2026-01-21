import java.util.*;
class MergeOverlappingInterval{
    public static List<List<Integer>> merge(int[][] intervals) {

        // Step 1: Sort intervals based on starting point
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<List<Integer>> ans = new ArrayList<>();
        int n = intervals.length;
        int i = 0;

        // Step 2: Traverse intervals
        while (i < n) {

            int start = intervals[i][0];
            int end = intervals[i][1];
            int j = i + 1;

            // Step 3: Merge all overlapping intervals
            while (j < n && intervals[j][0] <= end) {
                end = Math.max(end, intervals[j][1]);
                j++;
            }

            // Step 4: Add merged interval
            ans.add(Arrays.asList(start, end));

            // Move to next interval
            i = j;
        }

        return ans;
    }
     public static void main(String[] args) {

        

        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        List<List<Integer>> result =merge(intervals);

        for (List<Integer> interval : result) {
            System.out.print(interval + " ");
        }
    }
}

