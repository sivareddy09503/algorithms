//Largest local values in a matrix
//TC:O(n^2), sc:O(n^2)
/*Input: grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]
Output: [[9,9],[8,6]]
Explanation: The diagram above shows the original matrix and the generated matrix.
Notice that each value in the generated matrix corresponds to the largest value of a contiguous 3 x 3 matrix in grid*/
class Solution {
    public int[][] largestLocal(int[][] grid) {
        int max;
        int result[][] = new int[grid.length-2][grid.length-2];
        for(int i=0;i<grid.length-2;i++) {
            for(int j=0;j<grid.length-2;j++) {
                max = 0;
                for(int x=i;x<i+3;x++) {
                    for(int y=j;y<j+3;y++) {
                        max = Math.max(grid[x][y], max);
                    }
                }
                result[i][j] = max;
            }
        }
        return result;
    }
}