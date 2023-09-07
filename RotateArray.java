class RotateArray {
    //Rotate Array by k steps
    //Input: nums = [1,2,3,4,5,6,7], k = 3
    //Output: [5,6,7,1,2,3,4]
    //TC:O(n),SC:O(1)
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}