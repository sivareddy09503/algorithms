//Majority Element
//TC:O(n), SC:O(1)
//Input: nums = [3,2,3]
//Output: 3
class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int target = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) {
                count++;
            } else {
                count--;
            }
            if(count == 0) {
                target = nums[i];
                count++;
            }
        }
        return target;
    }
}