//Maximum product of two elements in an array
//TC:O(n), SC:O(1)
/*Input: nums = [3,4,5,2]
Output: 12 
Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.*/
class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0;
        int max2 = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>max1) {
                max2 = max1;
                max1 = nums[i];
            } else if(nums[i]>max2){
                max2 = nums[i];
            }
        }
        return (max1-1) * (max2-1);
    }
}