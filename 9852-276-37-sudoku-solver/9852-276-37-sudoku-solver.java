class Solution {
    public void solveSudoku(char[][] board) {
        backtrack(board,0);
    }
     public  boolean backtrack(char[][] sudoku, int position) {
        if(position>=81){
            return true;
        }
        int row = position / 9;
        int col = position % 9;
        if(sudoku[row][col]=='.'){
            for(int i=1;i<=9;i++){
                if(isValid(sudoku,row,col,(char)('0'+i))){
                    char c=(char)('0'+i);
                    sudoku[row][col]=c;
                    if(backtrack(sudoku,position+1)){
                        return true;
                    }
                    sudoku[row][col]='.';
                }
            }
            return false;
        }
        else{
           return backtrack(sudoku,position+1);
        }

    }

    public  boolean isValid(char[][] sudoku, int row, int col, char num) {
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == num || sudoku[i][col] == num) {
                return false;
            }
        }
        int subrow=(row/3)*3;
        int subcol=(col/3)*3;
        for(int i=subrow;i<subrow+3;i++){
            for(int j=subcol;j<subcol+3;j++){
                if(sudoku[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }
}