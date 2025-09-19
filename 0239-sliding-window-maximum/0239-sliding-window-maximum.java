class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> a = new ArrayList<>();
        
        int n=nums.length;
        for(int i=0;i<=n-k;i++)
        {
            int max=Integer.MIN_VALUE;
            for(int j=i;j<=i+k-1;j++)
            {
                max=Math.max(nums[j],max);
            }
            a.add(max);
        }
        int arr1[] = new int[a.size()];
        for(int i=0;i<a.size();i++)
        {
            arr1[i]=a.get(i);
        }
        return arr1;
    }
}