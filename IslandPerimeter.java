//Island perimeter
//TC:O(n^2), SC:O(n)
/*Input: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
Output: 16
Explanation: The perimeter is the 16 yellow stripes in the image above*/
class Solution {
    public int islandPerimeter(int[][] grid) {
        int p=0;
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                if(grid[i][j]==1) {
                    p+=4;
                    if(i>0 && grid[i-1][j]==1) p-=2;
                    if(j>0 && grid[i][j-1]==1) p-=2;
                }
            }
        }
        return p;
    }
}