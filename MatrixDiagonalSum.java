//Matrix Diagonal Sum
//TC:O(n^2), SC:O(1)
/*Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once*/
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0, n = mat[0].length-1;
        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat[0].length;j++) {
                if(i==j) {
                    sum +=mat[i][j];
                    mat[i][j] = 0;
                }
                if(i+j == mat.length-1) {
                    sum +=mat[i][j];
                }
            }
        }
        return sum;
    }
}