//Count pairs whose sum is less than target
//TC:O(nlogn), SC:O(n)
/*Input: nums = [-1,1,2,3,1], target = 2
Output: 3
Explanation: There are 3 pairs of indices that satisfy the conditions in the statement:
- (0, 1) since 0 < 1 and nums[0] + nums[1] = 0 < target
- (0, 2) since 0 < 2 and nums[0] + nums[2] = 1 < target 
- (0, 4) since 0 < 4 and nums[0] + nums[4] = 0 < target
Note that (0, 3) is not counted since nums[0] + nums[3] is not strictly less than the target.*/
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count = 0, i = 0, j=nums.size()-1;
        while(i<j) {
            if((nums.get(i) + nums.get(j))<target) {
                count += j-i;
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
}