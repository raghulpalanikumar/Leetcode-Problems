class Solution {
    public int climbStairs(int n) {
        if(n == 2 || n == 1) return n;  // base case
        int s = climbStairs(n-1) + climbStairs(n-2);
        return s;
    }
}
