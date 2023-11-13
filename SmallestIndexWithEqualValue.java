//Smallest index with equal value
//TC:O(n), SC:O(1)
//Input: nums = [0,1,2]
//Output: 0
class Solution {
    public int smallestEqual(int[] nums) {
        int result = -1;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==i%10) {
                result = i;
                break;
            }
        }
        return result;
    }
}