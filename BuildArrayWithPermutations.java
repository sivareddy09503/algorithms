//Build array from permutation
//TC:O(n), SC:O(n)
//Input: nums = [0,2,1,5,3,4]
//Output: [0,1,2,4,5,3]
class Solution {
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }
}