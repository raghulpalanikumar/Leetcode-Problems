class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(nums==null||n==0)
        {
            return 0;
        }
        int ar[]=new int[n+1];
        ar[0]=0;
        ar[1]=nums[0];
        for(int i=2;i<=n;i++)
        {
            ar[i]=Math.max(ar[i-1],ar[i-2]+nums[i-1]);
        }
        return ar[n];
    }
}