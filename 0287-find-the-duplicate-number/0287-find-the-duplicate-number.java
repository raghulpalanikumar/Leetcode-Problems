class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> a = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(a.contains(nums[i]))
            {
                return nums[i];
            }
            a.add(nums[i]);
        }
        return 0;
    }
}