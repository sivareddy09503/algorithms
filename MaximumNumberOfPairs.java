//Maximum number of Pairs in Array
//TC:O(n), SC:O(n)
/*Input: nums = [1,3,2,1,3,2,2]
Output: [3,1]
Explanation:
Form a pair with nums[0] and nums[3] and remove them from nums. Now, nums = [3,2,3,2,2].
Form a pair with nums[0] and nums[2] and remove them from nums. Now, nums = [2,2,2].
Form a pair with nums[0] and nums[1] and remove them from nums. Now, nums = [2].
No more pairs can be formed. A total of 3 pairs have been formed, and there is 1 number leftover in nums.*/
class Solution {
    public int[] numberOfPairs(int[] nums) {
        if(nums.length==1) return new int[]{0,1};

        Set<Integer> set = new HashSet<>();
        int pairs=0;
        for(int i=0;i<nums.length;i++) {
            if(!set.contains(nums[i])) {
                set.add(nums[i]);
            } else {
                set.remove(nums[i]);
                pairs++;
            }
        }
        return new int[]{pairs,set.size()};
    }
}