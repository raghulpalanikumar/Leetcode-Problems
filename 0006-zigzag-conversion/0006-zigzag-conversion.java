class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1 || s.length() <= numRows) return s;

        char[][] all = new char[numRows][s.length()];
        int row = 0;
        int col = 0;
        int cur = 0;

        while (cur < s.length()) {

            // Move DOWN
            while (row < numRows && cur < s.length()) {
                all[row++][col] = s.charAt(cur++);
            }

            row = Math.max(0, row - 2);

            // Move UP diagonally
            while (row > 0 && cur < s.length()) {
                all[row--][++col] = s.charAt(cur++);
            }

            col++;
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (all[i][j] != '\0') {
                    ans.append(all[i][j]);
                }
            }
        }

        return ans.toString();
    }
}
