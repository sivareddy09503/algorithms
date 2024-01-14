//Smallest range
//TC:O(n), SC:O(1)
/*Input: nums = [1], k = 0
Output: 0
Explanation: The score is max(nums) - min(nums) = 1 - 1 = 0*/
class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max,min;
        max = min = nums[0];
        for(int i=0;i<nums.length;i++) {
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        int diff = (max-k) - (min+k);
        return (diff>0)?diff:0;
    }
}