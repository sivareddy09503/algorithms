//Longest Increasing Subsequence
//TC:O(n^2), SC:O(n)
//Input: nums = [10,9,2,5,3,7,101,18]
//Output: 4
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if(n==1) return 1;
        int[] dp = new int[n];
        dp[0] = 1;
        int ans=0;
        for(int i=1;i<n;i++) {
            int len = 0;
            for(int j=0;j<i;j++) {
                if(nums[j]<nums[i]) {
                    len = Math.max(dp[j],len);
                }
            }
            dp[i] = 1+len;
            ans = Math.max(dp[i],ans);
        }
        return ans;
    }
}