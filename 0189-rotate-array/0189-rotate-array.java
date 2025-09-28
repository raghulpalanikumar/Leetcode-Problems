class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        rev(nums,0,n-1);
        rev(nums,0,k-1);
        rev(nums,k,n-1);
        }
        void rev(int nums[],int i,int k)
        {
            int start=i;
            int end=k;
            while(start<end)
            {
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }
    }
