//Search the insert position for an element in an array
//TC:O(n), SC:O(1)
//Input: nums = [1,3,5,6], target = 2
//Output: 1

class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end) {
            int mid = start +(end-start)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) end = mid-1;
            else start = mid+1;
        }
        return start;
    }
}