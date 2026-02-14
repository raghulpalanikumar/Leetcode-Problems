class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low=0;
        int high=0;
        for(int bloom:bloomDay)
        {
        high=Math.max(high,bloom);
        }
        int minday=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(generate(bloomDay,mid,k)>=m)
            {
                minday=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return minday;
    }
    public int generate(int bloomDay[],int m,int k)
    {
        int bouqu=0;
        int flower=0;
        for(int i=0;i<bloomDay.length;i++)
        {
        if(bloomDay[i]<=m)
        {
            flower++;
            if(flower==k)
            {
                bouqu++;
                flower=0;
            }
        }
        else
        {
            flower=0;
        }
        }
        return bouqu;
    }

}