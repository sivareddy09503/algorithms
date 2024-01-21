//Minimum operations to make the array increasing
//TC:O(n), SC:O(1)
/*Input: nums = [1,1,1]
Output: 3
Explanation: You can do the following operations:
1) Increment nums[2], so nums becomes [1,1,2].
2) Increment nums[1], so nums becomes [1,2,2].
3) Increment nums[2], so nums becomes [1,2,3].*/
class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i=1;i<n;i++) {
            if(nums[i]<=nums[i-1]) {
                ans = ans + nums[i-1]-nums[i]+1;
                nums[i] = nums[i-1] + 1;
            }
        }
        return ans;
    }
}