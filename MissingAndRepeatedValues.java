//Find missing and repeated values
//TC:O(n), SC:O(n)
/*Input: grid = [[1,3],[2,2]]
Output: [2,4]
Explanation: Number 2 is repeated and number 4 is missing so the answer is [2,4]*/
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int num = grid.length;
        Set<Integer> set = new HashSet<>();
        int[] ans = new int[2];
        for(int i=0;i<num;i++) {
            for(int j=0;j<num;j++) {
                if(set.contains(grid[i][j])) {
                    ans[0] = grid[i][j];
                }
                set.add(grid[i][j]);
            }
        }
        for(int i=1;i<=(num*num);i++) {
            if(!set.contains(i)) {
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}