//Range addition
//TC:O(n),SC:O(1)
/*Input: m = 3, n = 3, ops = [[2,2],[3,3]]
Output: 4
Explanation: The maximum integer in M is 2, and there are four of it in M. So return 4.*/
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int minRow = m, minCol = n;
        for(int[] arr:ops) {
            minRow = Math.min(minRow,arr[0]);
            minCol = Math.min(minCol,arr[1]);
        }
        return minRow*minCol;
    }
}