class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> ans = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int c= target-nums[i];
            if(ans.containsKey(c))
            {
                return new int[]{ans.get(c),i};
            }
            ans.put(nums[i],i);
        }
        return new int[]{0};
    }
}