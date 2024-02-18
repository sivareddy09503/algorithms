//projection-area-of-3d-shapes
//TC:O(n^2),SC:O(n)
/*Input: grid = [[1,2],[3,4]]
Output: 17
Explanation: Here are the three projections ("shadows") of the shape made with each axis-aligned plane.*/
class Solution {
    public int projectionArea(int[][] grid) {
        int a=0,x=0;
        for(int i=0;i<grid.length;i++) {
            int mr = Integer.MIN_VALUE;
            int mc = Integer.MIN_VALUE;
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j]!=0)x+=1;
                if(grid[i][j]>mr)mr=grid[i][j];
                if(grid[j][i]>mc)mc=grid[j][i];
            }
            a+=mr+mc;
        }
        return a+x;
    }
}