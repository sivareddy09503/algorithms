//Maximum product of three numbers
//TC:O(nlogn), SC:O(1)
//Input: nums = [1,2,3,4]
//Output: 24
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[0]*nums[1]*nums[n-1],nums[n-3]*nums[n-2]*nums[n-1]);
    }
}