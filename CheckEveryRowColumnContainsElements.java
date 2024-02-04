//Check if every row and column contains all numbers
//TC:O(n^2), SC:O(n)
/*Input: matrix = [[1,2,3],[3,1,2],[2,3,1]]
Output: true
Explanation: In this case, n = 3, and every row and column contains the numbers 1, 2, and 3.
Hence, we return true*/
class Solution {
    public boolean checkValid(int[][] matrix) {
        for(int r=0, n = matrix.length;r<n;r++) {
            Set<Integer> row = new HashSet<>();
            Set<Integer> col = new HashSet<>();
            for(int c=0;c<n;c++) {
                if(!row.add(matrix[r][c]) || !col.add(matrix[c][r])) {
                    return false;
                }
            }
        }
        return true;
    }
}