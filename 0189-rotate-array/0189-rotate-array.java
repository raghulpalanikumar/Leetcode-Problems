class Solution {
    public void rotate(int[] nums, int k) {
    int n = nums.length;
    rotat(nums,0,n-1);
    rotat(nums,0,k-1);
    rotat(nums,k,n-1);
    }
    void rotat(int nums[],int i,int j)
    {
        int left=i;
        int right=j;
        while(left<right)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}