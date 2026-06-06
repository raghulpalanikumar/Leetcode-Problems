class Solution {
    public int fib(int n) {
    int f0=0;
    int f1=1;
    int f2=0;
    if(n==1)
    {
        return 1;
    }
    else
    {
    for(int i=1;i<n;i++)
    {
    f2=f1+f0;
    f0=f1;
    f1=f2;
    }
    }
     return f2;
}
}