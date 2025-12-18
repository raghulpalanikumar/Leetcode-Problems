class Solution {
    int count = 0;

    public int islandPerimeter(int[][] grid) {

        if (grid == null || grid.length == 0) return 0;

        int m = grid.length;
        int n = grid[0].length;

        // Only one island → start DFS once
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == 1) {
                    dfs(grid, r, c);
                    return count;
                }
            }
        }
        return 0;
    }

    void dfs(int[][] grid, int r, int c) {

        // boundary or water → perimeter edge
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length
                || grid[r][c] == 0) {
            count++;
            return;
        }

        // already visited land
        if (grid[r][c] == 2) {
            return;
        }

        // mark visited
        grid[r][c] = 2;

        dfs(grid, r, c + 1);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r - 1, c);
    }
}
