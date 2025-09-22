class Solution {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        int[] dp = new int[n + 1]; // 1D DP array
        dp[0] = 0; // T0
        dp[1] = 1; // T1
        dp[2] = 1; // T2

        // Fill dp array iteratively
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        return dp[n];
    }

    // Optional test
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10;
        System.out.println("Tribonacci(" + n + ") = " + sol.tribonacci(n));
    }
}
