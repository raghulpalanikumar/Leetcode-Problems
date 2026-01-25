class Solution {
    public int rob(int[] nums) {
        int prev2 = 0;
        int prev1 = 0;

        for (int num : nums) {
            int pick = num + prev2;
            int skip = prev1;
            int curr = Math.max(pick, skip);

            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
