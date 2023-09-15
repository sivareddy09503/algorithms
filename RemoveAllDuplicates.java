class RemoveAllDuplicates {
    //Remove duplicates from sorted array
    //Input: nums = [1,1,2]
    //Output: 2, nums = [1,2,_]
    //TC:O(n), SC:O(1)
    public int removeDuplicates(int[] nums) {
        int left = 0, right = 0;
        while(right<nums.length) {
            if(nums[left]!=nums[right]) {
                left++;
                nums[left] = nums[right];
            }
            right++;
        }
        return left+1;
    }
}