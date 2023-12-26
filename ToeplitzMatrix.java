//Toeplitz matrix
//TC:O(n^2), SC:O(1)
/*Input: matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
Output: true
Explanation:
In the above grid, the diagonals are:
"[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
In each diagonal all elements are the same, so the answer is True*/
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length-1;i++) {
            for(int j=0;j<matrix[0].length-1;j++) {
                int ele = matrix[i][j];
                if(i<matrix.length-1 && j<matrix[0].length-1 && matrix[i+1][j+1]!=ele) {
                    return false;
                }
            }
        }
        return true;
    }
}