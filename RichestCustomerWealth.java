//Richest Customer Wealth
//TC:O(n^2), SC:O(1)
//Input: accounts = [[1,5],[7,3],[3,5]]
//Output: 10
class Solution {
    public int maximumWealth(int[][] accounts) {
        int result = 0, sum = 0;
        for(int i=0;i<accounts.length;i++) {
            for(int j=0;j<accounts[0].length;j++) {
                result += accounts[i][j];
            }
            sum = Math.max(sum,result);
            result = 0;
        }
        return sum;
    }
}