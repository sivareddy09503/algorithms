//Squares of a Sorted Array
//TC:O(n), SC:O(n)
//Input: nums = [-4,-1,0,3,10]
//Output: [0,1,9,16,100]
class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int index = nums.length-1;
        int[] result = new int[nums.length];
        while(left<=right) {
            if(Math.abs(nums[left])>Math.abs(nums[right])) {
                result[index] = nums[left] * nums[left];
                left++;
            } else {
                result[index] = nums[right] * nums[right];
                right--;
            }
            index--;
        }
        return result;
    }
}