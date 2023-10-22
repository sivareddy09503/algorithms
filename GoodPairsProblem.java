//Number of Good pairs problem
//TC:O(n), SC:O(1)
//Input: nums = [1,2,3,1,1,3]
//Output: 4
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        int count[] = new int[101];
        for(int n:nums) {
            count[n]++;
        }
        for(int n:count) {
            ans += (n*(n-1))/2;
        }
        return ans;
    }
}