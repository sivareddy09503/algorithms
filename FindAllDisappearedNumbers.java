class FindAllDisappearedNumbers {
    //Find all numbers disappeared in an array
    //Input: nums = [4,3,2,7,8,2,3,1]
    //Output: [5,6]
    //TC:O(n), SC:O(1)
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            int index = Math.abs(nums[i])-1;
            if(nums[index]>0) {
                nums[index] = -1 * nums[index];
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>0) {
                list.add(i+1);
            }
        }
        return list;
    }
}