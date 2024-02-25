//Contains duplicate
//TC:O(n), SC:O(n)
/*Input: nums = [1,2,3,1], k = 3
Output: true*/
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int j=0;
        for(int i=0;i<nums.length;i++) {     
            if(!set.add(nums[i])) {
                return true;
            } 
            if(set.size()>=k+1) {
                set.remove(nums[j++]);
            }
        }
        return false;
    }
}