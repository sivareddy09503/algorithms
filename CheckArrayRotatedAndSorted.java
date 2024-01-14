//Check if array is sorted and rotated
//TC:O(n), SC:O(1)
/*Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2]*/
class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i]>nums[i+1])
                count++;
        }
        if(count == 0)
            return true;
        else if(count>1)
            return false;
        else if(nums[0]>=nums[nums.length-1])
            return true;
        else
            return false;
    }
}