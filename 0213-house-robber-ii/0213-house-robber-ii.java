import java.util.*;

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        Integer[] dp1 = new Integer[n];
        Integer[] dp2 = new Integer[n];

        int case1 = solve(nums, 0, n - 2, dp1); // include first, exclude last
        int case2 = solve(nums, 1, n - 1, dp2); // exclude first, include last

        return Math.max(case1, case2);
    }

    int solve(int[] nums, int i, int end, Integer[] dp) {
        if (i > end)
            return 0;

        if (dp[i] != null)
            return dp[i];

        int rob = nums[i] + solve(nums, i + 2, end, dp);
        int skip = solve(nums, i + 1, end, dp);

        return dp[i] = Math.max(rob, skip);
    }
}
