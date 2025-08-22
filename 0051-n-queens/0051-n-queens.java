import java.util.*;

class Solution {
    private List<List<String>> res;
    private boolean[] col, d1, d2; // cols, (r-c)+(n-1), r+c
    private char[][] board;
    private int n;

    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        res = new ArrayList<>();
        col = new boolean[n];
        d1 = new boolean[2*n - 1];
        d2 = new boolean[2*n - 1];
        board = new char[n][n];
        for (char[] row : board) Arrays.fill(row, '.');
        backtrack(0);
        return res;
    }

    private void backtrack(int r) {
        if (r == n) {
            List<String> cur = new ArrayList<>();
            for (int i = 0; i < n; i++) cur.add(new String(board[i]));
            res.add(cur);
            return;
        }
        for (int c = 0; c < n; c++) {
            int id1 = r - c + (n - 1), id2 = r + c;
            if (col[c] || d1[id1] || d2[id2]) continue;
            col[c] = d1[id1] = d2[id2] = true;
            board[r][c] = 'Q';
            backtrack(r + 1);
            board[r][c] = '.';
            col[c] = d1[id1] = d2[id2] = false;
        }
    }
}