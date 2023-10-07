//Edit Distance
//TC:O(mn),SC:O(mn)
//Input: word1 = "horse", word2 = "ros"
//Output: 3
//horse -> rorse (replace 'h' with 'r'), rorse -> rose (remove 'r'), rose -> ros (remove 'e') --> 3 operations
class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        if(m==0) return n;
        if(n==0) return m;
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++) dp[i][0] = i;//row
        for(int j=1;j<=n;j++) dp[0][j] = j;//column
        for(int i=1;i<=m;i++) {
            for(int j=1;j<=n;j++) {
                char c1 = word1.charAt(i-1);
                char c2 = word2.charAt(j-1);
                if(c1==c2) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    int insert = dp[i][j-1];
                    int delete = dp[i-1][j];
                    int replace = dp[i-1][j-1];
                    dp[i][j] = 1 + Math.min(insert,Math.min(delete,replace));
                }
            }
        }
        return dp[m][n];
    }
}