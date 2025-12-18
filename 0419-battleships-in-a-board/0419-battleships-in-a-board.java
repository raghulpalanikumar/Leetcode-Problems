class Solution {

    public int countBattleships(char[][] board) {

        if (board == null || board.length == 0) return 0;

        int m = board.length;
        int n = board[0].length;
        int battleships = 0;

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (board[r][c] == 'X') {
                    dfs(board, r, c);
                    battleships++;   // one battleship found
                }
            }
        }
        return battleships;
    }

    void dfs(char[][] board, int r, int c) {

        // base case
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length
                || board[r][c] == '.') {
            return;
        }

        // mark visited
        board[r][c] = '.';

        // explore all 4 directions
        dfs(board, r, c + 1); // right
        dfs(board, r + 1, c); // down
        dfs(board, r, c - 1); // left
        dfs(board, r - 1, c); // up
    }
}
