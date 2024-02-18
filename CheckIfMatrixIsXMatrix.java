//check-if-matrix-is-x-matrix
//TC:O(n^2), SC:O(n)
/*Input: grid = [[2,0,0,1],[0,3,1,0],[0,5,2,0],[4,0,0,2]]
Output: true
Explanation: Refer to the diagram above. 
An X-Matrix should have the green elements (diagonals) be non-zero and the red elements be 0.
Thus, grid is an X-Matrix.*/
class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n=grid.length-1;
        boolean[][] isVisited = new boolean[grid.length][grid.length];
        for(int i=0;i<grid.length;i++) {
            if(grid[i][i]==0) {
                return false;
            } else {
                isVisited[i][i]=true;
            }
            if(grid[i][n]==0) {
                return false;
            } else {
                isVisited[i][n--]=true;
            }
        }
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid.length;j++) {
                if(!isVisited[i][j]) {
                    if(grid[i][j]!=0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}