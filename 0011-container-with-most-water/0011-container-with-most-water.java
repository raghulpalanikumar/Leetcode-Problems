class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int max=0;
        while(left<right)
        {
            int index= right-left;
            int value=Math.min(height[left],height[right]);
            max=Math.max(max,value*index);
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return max;
    }
}