//Range sum query immutable
//TC:O(n), SC:O(1)
//["NumArray", "sumRange", "sumRange", "sumRange"]
//[[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
class NumArray {
    public int[] arr2;
    public NumArray(int[] nums) {
        arr2 = new int[nums.length+1];
        for(int i=0;i<nums.length;i++) {
            arr2[i+1] = arr2[i]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return arr2[right+1] - arr2[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */