class FindDuplicateNumber {
    //Find the Duplicate Number
    //Input: nums = [1,3,4,2,2]
    //Output: 2
    //TC:O(n), SC:O(n)
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        //int result = 0;
        for(int i=0;i<nums.length;i++) {
            if(set.contains(nums[i])) {
                return nums[i];
            } else {
                set.add(nums[i]);
            }
        }
        return 0;
    }
}