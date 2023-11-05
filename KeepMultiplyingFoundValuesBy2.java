//Keep Multiplying Found Values by Two
//TC:O(n), SC: O(n)
//Input: nums = [5,3,6,1,12], original = 3
//Output: 24
class Solution {
    public int findFinalValue(int[] nums, int original) {
        int result = 1;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++) {
            if(set.contains(original)) {
                original = 2 * original;
            }
        }
        return original;
    }
}