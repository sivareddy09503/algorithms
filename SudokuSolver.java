//Sudoku solver
//TC:O(n!), SC:O(n^2)
class Solution {
    public void solveSudoku(char[][] board) {
        dfs(board,0);
    }
    private boolean dfs(char[][] board, int d) {
        if(d==81) return true;
        int i=d/9, j=d%9;
        //If number is prefilled
        if(board[i][j] != '.') return dfs(board, d+1);
        boolean[] flag = new boolean[10];
        validate(board,i,j,flag);
        for(int k=1;k<=9;k++) {
            if(flag[k]) {
                board[i][j] = (char)(k+'0');
                if(dfs(board,d+1)) return true;
            }
        }
        board[i][j] = '.';
        return false;
    }
    private void validate(char[][] board, int i, int j, boolean[] flag) {
        Arrays.fill(flag,true);
        for(int k=0;k<9;k++) {
            if(board[i][k] != '.') flag[board[i][k]-'0'] = false;
            if(board[k][j] != '.') flag[board[k][j]-'0'] = false;
            int r = i/3*3 + k/3;
            int c = j/3*3 + k%3;
            if(board[r][c] != '.') flag[board[r][c]-'0'] = false;
        }
    }

}