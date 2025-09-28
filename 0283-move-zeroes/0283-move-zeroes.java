class Solution {
    public void moveZeroes(int[] nums) {
    int nums1[]=new int[nums.length];
    int it=0;
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]!=0)
        {
            nums1[it++]=nums[i];
        }
    }
    }
}