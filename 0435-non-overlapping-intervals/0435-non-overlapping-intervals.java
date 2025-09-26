class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> (a[0]-b[0])); // sort by start time
        int remove = 0;
        int currEnd = intervals[0][1]; // end of first interval

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= currEnd) {
                // no overlap → update currEnd
                currEnd = intervals[i][1];
            } else {
                // overlap → remove one
                remove++;
                // keep the interval with the smaller end (greedy)
                currEnd = Math.min(currEnd, intervals[i][1]);
            }
        }
        return remove;
    }
}
