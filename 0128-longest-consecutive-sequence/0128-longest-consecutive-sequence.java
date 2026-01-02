class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int max = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            // skip duplicates
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            // consecutive number
            else if (nums[i] == nums[i - 1] + 1) {
                count++;
            }
            // break in sequence
            else {
                count = 1;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}
