//Word Break
//TC:O(n^3), SC:O(n)
//Input: s = "leetcode", wordDict = ["leet","code"]
//Output: true
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        Set<String> set = new HashSet<>(wordDict);
        for(int i=1;i<=s.length();i++) {
            for(int j=0; j<i; j++) {
                String suffix = s.substring(j,i);
                if(set.contains(suffix) && dp[j]==true) {
                    dp[i] = true;
                }
            }
        }
        return dp[s.length()];
    }
}