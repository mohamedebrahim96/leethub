class Solution {
    private int count = 0;
    
    public int totalNQueens(int n) {
        // Track used columns and diagonals
        boolean[] cols = new boolean[n];            // columns
        boolean[] diag = new boolean[2 * n];        // row - col + n
        boolean[] antiDiag = new boolean[2 * n];    // row + col
        
        backtrack(0, n, cols, diag, antiDiag);
        return count;
    }
    
    private void backtrack(int row, int n, boolean[] cols, boolean[] diag, boolean[] antiDiag) {
        if (row == n) {
            count++;
            return;
        }
        
        for (int col = 0; col < n; col++) {
            int d = row - col + n;   // shift index for diagonals
            int ad = row + col;
            
            if (cols[col] || diag[d] || antiDiag[ad]) continue;
            
            // place queen
            cols[col] = diag[d] = antiDiag[ad] = true;
            
            backtrack(row + 1, n, cols, diag, antiDiag);
            
            // backtrack
            cols[col] = diag[d] = antiDiag[ad] = false;
        }
    }
}