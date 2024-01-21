//Count he number of incremovable subarrays
//TC:O(n^3), SC:O(1)
/*Input: nums = [1,2,3,4]
Output: 10
Explanation: The 10 incremovable subarrays are: [1], [2], [3], [4], [1,2], [2,3], [3,4], [1,2,3], [2,3,4], and [1,2,3,4], because on removing any one of these subarrays nums becomes strictly increasing. Note that you cannot select an empty subarray.*/
class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int res = 0;
        for(int i=0;i<nums.length;i++) {
            for(int j=i;j<nums.length;j++) {
                if(isIncreasing(nums,i,j)) {
                    res++;
                }
            }
        }
        return res;
    }
    public boolean isIncreasing(int[] nums, int low, int high) {
        for(int i=0;i<low-1;i++) {
            if(nums[i]>=nums[i+1]) return false;
        }
        if(low>0 && high < nums.length-1 && nums[low-1]>=nums[high+1]) {
            return false;
        }
        for(int i=high+1;i<nums.length-1;i++) {
            if(nums[i]>=nums[i+1]) return false;
        }
        return true;
    }
}