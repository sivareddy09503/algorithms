//Find the distinct difference array
//TC:O(n^2), SC:O(n)
//Input: nums = [1,2,3,4,5]
//Output: [-3,-1,1,3,5]
//Explanation: For index i = 0, there is 1 element in the prefix and 4 distinct elements in the suffix. Thus, diff[0] = 1 - 4 = -3.
class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int[] result = new int[nums.length];
        Set<Integer> prefixSet = new HashSet<>();
        Set<Integer> suffixSet = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            prefixSet.clear();
            suffixSet.clear();
            for(int j=0;j<nums.length;j++){
                if(j<=i) {
                    if(!prefixSet.contains(nums[j])) {
                        prefixSet.add(nums[j]);
                    }
                } else {
                    if(!suffixSet.contains(nums[j])) {
                        suffixSet.add(nums[j]);
                    }
                }
            }
            result[i] = prefixSet.size()-suffixSet.size();
        }
        return result;
    }
}