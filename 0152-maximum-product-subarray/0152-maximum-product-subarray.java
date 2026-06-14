class Solution {
    public int maxProduct(int[] nums) {
    int ans = nums[0];
    int max=nums[0];
    int min=nums[0];
    for(int i=1;i<nums.length;i++)
    {
    int curr = nums[i];
    int a = curr;
    int b = a*max;
    int c = a*min;
    max = Math.max(a,(Math.max(b,c)));
    min = Math.min(a,(Math.min(b,c)));
    ans = Math.max(ans,max);   
    }
    return ans;
    }
}