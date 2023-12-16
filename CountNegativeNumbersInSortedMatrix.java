//Count negative numbers in a sorted matrix
//TC:O(nlogn), SC:O(1)
/*Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix*/
class Solution {
    public int countNegatives(int[][] grid) {
        /*int count = 0;
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j]<0) count++;
            }
        }
        return count;*/
        int m = grid.length;
        int n = grid[0].length;
        int ans =0, hi=n,lo=0;
        for(int i=0;i<m;i++) {
            while(lo<hi) {
                int mid = lo +(hi-lo)/2;
                if(grid[i][mid]<0) hi=mid;
                else lo=mid+1;
            }
            ans += n-lo;
            hi=lo;
            lo=0;
        }
        return ans;
    }
}