class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
        int n1 = t1.length();
        int n2 = t2.length();
        int[][] dp = new int[n1][n2];
        for (int[] row : dp) Arrays.fill(row, -1);
        return lcs(0, 0, t1, t2, dp);
    }

    int lcs(int i, int j, String t1, String t2, int[][] dp) {
        if (i >= t1.length() || j >= t2.length()) return 0;
        if (dp[i][j] != -1) return dp[i][j];

        if (t1.charAt(i) == t2.charAt(j)) {
            dp[i][j] = 1 + lcs(i + 1, j + 1, t1, t2, dp);
        } else {
            dp[i][j] = Math.max(lcs(i + 1, j, t1, t2, dp), lcs(i, j + 1, t1, t2, dp));
        }
        return dp[i][j];
    }
}
