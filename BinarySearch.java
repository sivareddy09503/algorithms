class BinarySearch {
    //Binary Search
    //Input: nums = [-1,0,3,5,9,12], target = 9
    //Output: 4
    //Explanation: 9 exists in nums and its index is 4
    //TC:O(logn), SC:O(1)
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while(left <= right) {
            int mid = left + (right-left)/2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid]<target) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return -1;
    }
}