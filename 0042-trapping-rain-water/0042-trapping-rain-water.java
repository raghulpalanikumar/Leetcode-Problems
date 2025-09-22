class Solution {
    public int trap(int[] height) {
        int arr1[] = new int[height.length];
        int arr2[] = new int[height.length];
        int max=-1;
        int sum=0;
        for(int i=0;i<height.length;i++)
        {
        if(height[i]>max)
        {
        max=height[i];
        }
        arr1[i]=max;
        }
        max=-1;
        for(int i=height.length-1;i>=0;i--)
        {
            if(height[i]>max)
            {
                max=height[i];
            }
            arr2[i]=max;
        }
        for(int i=0;i<height.length;i++)
        {
        sum=sum+(Integer.min(arr1[i],arr2[i]))-height[i];
        }
        return sum;
    }
}