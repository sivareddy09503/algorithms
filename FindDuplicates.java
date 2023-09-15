class FindDuplicates {
    //Find all duplicates in an array
    //Input: nums = [4,3,2,7,8,2,3,1]
    //Output: [2,3]
    //TC:O(n), SC:O(1)
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            int index = Math.abs(nums[i])-1;
            if(nums[index]<0) {
                list.add(Math.abs(nums[i]));
            }
            if(nums[index]>0) {
                nums[index] = -1 * nums[index];
            }
        }
        return list;
    }
}