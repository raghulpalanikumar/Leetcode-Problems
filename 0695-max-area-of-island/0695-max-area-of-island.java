class Solution {
    int count=0;
    public int maxAreaOfIsland(int[][] grid) {

        if (grid == null || grid.length == 0) return 0;

        int m = grid.length;
        int n = grid[0].length;
        int max = 0;

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == 1) {
                    count=0;
                    dfs(grid,r,c);
                    if(count>max)
                    {
                        max=count;
                    }
                }

            }
        }

        return max;
    }

    void dfs(int[][] grid, int r, int c) {

        // base case
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length
                || grid[r][c] == 0) {
            return;
        }

        // mark as visited
        grid[r][c] = 0;

        count++;

    dfs(grid, r, c + 1); // right
    dfs(grid, r + 1, c); // down
    dfs(grid, r, c - 1); // left
    dfs(grid, r - 1, c); // up

    }
}
