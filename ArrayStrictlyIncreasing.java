//remove-one-element-to-make-the-array-strictly-increasing
//TC:O(n),SC:O(1)
/*Input: nums = [1,2,10,5,7]
Output: true
Explanation: By removing 10 at index 2 from nums, it becomes [1,2,5,7].
[1,2,5,7] is strictly increasing, so return true.*/
class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int count=0, p=0;
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i]>nums[i+1] || nums[i]==nums[i+1]) {
                count++;
                p=i;
            }
        }
        if(count>1) return false;
        else if(count==1) {
            if(p==0 || p==nums.length-2) return true;
            if(nums[p+1]>nums[p-1] || nums[p+2]>nums[p]) return true;
            else return false;
        }
        return true;
    }
}