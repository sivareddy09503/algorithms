//Minimum Path Sum using DP
//TC:O(mn), SC:O(mn)
//Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
//Output: 7
class Solution {
    public int minPathSum(int[][] grid) {
        int height = grid.length;
        int width = grid[0].length;
        int[][] dp = new int[height][width];
        dp[0][0] = grid[0][0];
        for(int i=1;i<height;i++) {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        for(int j=1;j<width;j++) {
            dp[0][j] = dp[0][j-1]+grid[0][j];
        }
        for(int i=1;i<height;i++) {
            for(int j=1; j<width;j++) {
                dp[i][j] = grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[height-1][width-1];
    }
}