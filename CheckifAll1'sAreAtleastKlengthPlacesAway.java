//Check If All 1's are atleast length k places away
//TC:O(n), SC:O(1)
//Input: nums = [1,0,0,0,1,0,0,1], k = 2
//Output: true
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int count = 0, flag = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==1) {
                if(count<k && flag ==1) {
                    return false;
                }
                count = 0;
                flag = 1;
            } else {
                count++;
            }
        }
        return true;
    }
}