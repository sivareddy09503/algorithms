//Make array zero by subtracting equal amount
//TC-O(n), SC - O(n)
/*Input: nums = [1,5,0,3,5]
Output: 3
Explanation:
In the first operation, choose x = 1. Now, nums = [0,4,0,2,4].
In the second operation, choose x = 2. Now, nums = [0,2,0,0,2].
In the third operation, choose x = 2. Now, nums = [0,0,0,0,0].*/
class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int a:nums) {
            if(a>0) set.add(a);
        }
        return set.size();
    }
}