class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        if(piles.length>h)
        {
            return 0;
        }
        int left=1;
        int right=-1;
        for(int i=0;i<piles.length;i++)
        {
            right=Math.max(right,piles[i]);
        }
        int ans=0;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            int timeTaken=0;
            for(int i=0;i<piles.length;i++)
            {
                timeTaken+=Math.ceil((double)(piles[i])/mid);
            }
            if(timeTaken>h)
            {
                left=mid+1;
            }
            else
            {
                ans=mid;
                right=mid-1;
            }
        }
        return ans;
    }
}