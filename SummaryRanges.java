//Summary Ranges
//TC:O(n^2), SC:O(1)
//Input: nums = [0,1,2,4,5,7]
//Output: ["0->2","4->5","7"]
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            int a = nums[i];
            while(i<nums.length-1 && nums[i]+1 == nums[i+1]) {
                i++;
            }
            if(a==nums[i]) {
                result.add("" + nums[i]);
            } else {
                result.add(a + "->" + nums[i]);
            }
        }
        return result;
    }
}