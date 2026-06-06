class Solution {
    public int climbStairs(int n) {
    int prev0 =0;
    int prev1 =1;
    int sum=0;
    for(int i=1;i<=n;i++)
    {
    sum = prev0+prev1;
    prev0=prev1;
    prev1=sum;
    }
    return sum;
    }
}