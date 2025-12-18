class Solution {
    long count=0;
    int c1=0;
    public int countIslands(int[][] grid,int k) {

        if (grid == null || grid.length == 0) return 0;

        int m = grid.length;
        int n = grid[0].length;
        int max = 0;

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c]!=0) {
                    count=0;
                    dfs(grid,r,c);
                    if(count%k==0)
                    {
                        c1+=1;
                    }
                }

            }
        }
        return c1;
    }

    void dfs(int[][] grid, int r, int c) {

    
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length
                || grid[r][c] == 0) {
            return;
        }

         count+=grid[r][c];
        grid[r][c] = 0;

       

    dfs(grid, r, c + 1); 
    dfs(grid, r + 1, c); 
    dfs(grid, r, c - 1);
    dfs(grid, r - 1, c); 

    }
}
