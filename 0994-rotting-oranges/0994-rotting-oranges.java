import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {

        Queue<int[]> q = new LinkedList<>();

        int m = grid.length;
        int n = grid[0].length;
        int fresh = 0;
        int timer = 0;

        // initial scan
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) fresh++;
                else if (grid[i][j] == 2) q.offer(new int[]{i, j});
            }
        }

        // BFS
        while (!q.isEmpty()) {
            int size = q.size();
            boolean rotted = false;

            while (size-- > 0) {
                int[] p = q.poll();
                int r = p[0];
                int c = p[1];

                // right
                if (c + 1 < n && grid[r][c + 1] == 1) {
                    grid[r][c + 1] = 2;
                    fresh--;
                    q.offer(new int[]{r, c + 1});
                    rotted = true;
                }

                // left
                if (c - 1 >= 0 && grid[r][c - 1] == 1) {
                    grid[r][c - 1] = 2;
                    fresh--;
                    q.offer(new int[]{r, c - 1});
                    rotted = true;
                }

                // down
                if (r + 1 < m && grid[r + 1][c] == 1) {
                    grid[r + 1][c] = 2;
                    fresh--;
                    q.offer(new int[]{r + 1, c});
                    rotted = true;
                }

                // up
                if (r - 1 >= 0 && grid[r - 1][c] == 1) {
                    grid[r - 1][c] = 2;
                    fresh--;
                    q.offer(new int[]{r - 1, c});
                    rotted = true;
                }
            }

            if (rotted) timer++;
        }

        return fresh == 0 ? timer : -1;
    }
}
