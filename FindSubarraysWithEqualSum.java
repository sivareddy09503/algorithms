//Find subarrays with equal sum
//TC:O(n), SC:O(n)
/*Input: nums = [4,2,4]
Output: true
Explanation: The subarrays with elements [4,2] and [2,4] have the same sum of 6.*/
class Solution {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=1;i<nums.length;i++) {
            if(!set.add(nums[i]+nums[i-1]))
                return true;
        }
        return false;
    }
}