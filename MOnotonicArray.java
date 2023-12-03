//Monotonic Array
//TC:O(n), SC:O(1)
//Input: nums = [1,2,2,3]
//Output: true
class Solution {
    public boolean isMonotonic(int[] nums) {
        int sign = 0;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]<nums[i-1]) {
                if(sign==0) sign = -1;
                else if(sign==1) return false;
            } else if(nums[i]>nums[i-1]) {
                if(sign==0) sign = 1;
                else if(sign==-1) return false;
            }
        }
        return true;
    }
}