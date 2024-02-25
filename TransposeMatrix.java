//Transpose matrix
//TC:O(n^2), SC:O(n^2)
/*Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]*/
class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] res = new int[cols][rows];
        for(int i=0;i<cols;i++) {
            for(int j=0;j<rows;j++) {
                res[i][j] = matrix[j][i];
            }
        }
        return res;
    }
}