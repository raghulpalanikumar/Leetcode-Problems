class Solution {
    public int jump(int[] nums) {
        int farthest = 0;
        int end = 0;
        int count = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            
            // when we reach the end of current jump range
            if (i == end) {
                count++;
                end = farthest;
            }
        }
        return count;
    }
}
