//Remove element
//TC:O(n),SC:O(1)
//Input: nums = [3,2,2,3], val = 3
//Output: 2, nums = [2,2,_,_]
class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        for(int j=0;j<nums.length;j++) {
            if(nums[j]!=val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
    }
}