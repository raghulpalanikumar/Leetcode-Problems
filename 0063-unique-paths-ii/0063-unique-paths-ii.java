class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        return solve(0,0,obstacleGrid.length,obstacleGrid[0].length,dp,obstacleGrid);
    }
    private int solve(int i, int j, int m, int n, int[][] dp,int obstacleGrid[][]) {
        // Out of bounds
        if (i >= m || j >= n) return 0;
        //reached the rock
        if(obstacleGrid[i][j]==1) return 0;
        // Reached destination
        if (i == m - 1 && j == n - 1) return 1;

        // Already calculated
        if (dp[i][j] != 0) return dp[i][j];

        // Move down + Move right
        dp[i][j] = solve(i + 1, j, m, n, dp,obstacleGrid) + solve(i, j + 1, m, n, dp,obstacleGrid);

        return dp[i][j];
    }
}
