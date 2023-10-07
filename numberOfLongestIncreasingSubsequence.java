//Number of Longest Increasing Subsequence
//TC:O(n^2), SC:O(n)
//Input: nums = [1,3,5,4,7]
//Output: 2
class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] length = new int[n];
        int[] count  = new int[n];
        Arrays.fill(length,1);
        Arrays.fill(count,1);
        int lengthOfLIS = 1;
        for(int i=1;i<n;i++) {
            for(int j=0;j<i;j++) {
                if(nums[j]<nums[i]) {
                    if(length[i]<1+length[j]) {
                        length[i] = 1+length[j];
                        count[i] = count[j];
                    } else if(length[i] == 1+length[j]){
                        count[i] += count[j];
                    }
                }
                lengthOfLIS = Math.max(length[i],lengthOfLIS);
            }
        }
        int ans =0;
        for(int i=0;i<n;i++) {
            if(length[i]==lengthOfLIS) {
                ans += count[i];
            }
        }
        return ans;
    }
}