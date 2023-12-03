//Minimum distance to th target element
//TC:O(n), SC:O(1)
/*Input: nums = [1,2,3,4,5], target = 5, start = 3
Output: 1
Explanation: nums[4] = 5 is the only value equal to target, so the answer is abs(4 - 3) = 1*/
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        boolean alreadyOccured = false;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==target) {
                ans = alreadyOccured ? Math.min(ans,Math.abs(i-start)) : Math.abs(i-start);
                alreadyOccured = true;
            }
        }
        return ans;
    }
}