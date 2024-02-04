//Maximum ascending subarray sum
//TC:O(n), SC:O(1)
/*Input: nums = [10,20,30,5,10,50]
Output: 65
Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.*/
class Solution {
    public int maxAscendingSum(int[] nums) {
        int res = nums[0], temp = nums[0];
        for(int i=1;i<nums.length;i++) {
            if(nums[i]>nums[i-1]) {
                temp += nums[i];
            } else {
                temp = nums[i];
            }
            res = Math.max(res,temp);
        }
        return res;
    }
}