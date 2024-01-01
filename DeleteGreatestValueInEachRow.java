//Delete greatest value in each row
//TC:O(nmlogm), SC:O(1)
/*Input: grid = [[1,2,4],[3,3,1]]
Output: 8
Explanation: The diagram above shows the removed values in each step.
- In the first operation, we remove 4 from the first row and 3 from the second row (notice that, there are two cells with value 3 and we can remove any of them). We add 4 to the answer.
- In the second operation, we remove 2 from the first row and 3 from the second row. We add 3 to the answer.
- In the third operation, we remove 1 from the first row and 1 from the second row. We add 1 to the answer.
The final answer = 4 + 3 + 1 = 8*/
class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for(int i=0;i<grid.length;i++) 
            Arrays.sort(grid[i]);
        int res = 0;
        for(int i=0;i<grid[0].length;i++) {
            int max = 0;
            for(int j=0;j<grid.length;j++)
                max = Math.max(max,grid[j][i]);
            res += max;
        }
        return res;
    }
}