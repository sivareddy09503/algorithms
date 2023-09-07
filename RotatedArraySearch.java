class RotatedArraySearch {
    //search-in-rotated-sorted-array
    //Input: nums = [4,5,6,7,0,1,2], target = 0
    //Output: 4
    //TC:O(logn), SC: O(1)
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right) {
            int mid = left + (right-left)/2;
            if(target == nums[mid]) return mid;
            if(nums[left]<=nums[mid]) {//left to right is sorted
                if(nums[left]<=target && nums[mid]> target) {
                    right = mid-1;
                } else {
                    left = mid+1;
                }
            } else {//mid to right is sorted
                if(nums[right]>=target && nums[mid]<target) {
                    left = mid+1;
                } else {
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}