class Solution {
    public int tribonacci(int n) {
       int t0= 0;
       int t1= 1;
       int t2= 1;
       int t3;
       if(n==1 || n== 0)
       {
        return n;
       }
       if(n==2)
       {
        return 1;
       }
       t3 = tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
        return t3;
       }
      
    }
