class Solution {
    public int jump(int[] nums) {
      int farthest=0;
      int count=0;
      for(int i=0;i<nums.length;i++)
      {
        if(i>farthest) break;
        if(nums.length!=1)
        {
        farthest =Math.max(farthest,i+nums[i]);
        count++;
        if(farthest>=nums.length-1) return count;
      }
      }
      return count;  
    }

}