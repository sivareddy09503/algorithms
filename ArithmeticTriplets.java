//Number of arithmetic triplets
//TC:O(n), SC:O(n)
/*Input: nums = [0,1,4,6,7,10], diff = 3
Output: 2
Explanation:
(1, 2, 4) is an arithmetic triplet because both 7 - 4 == 3 and 4 - 1 == 3.
(2, 4, 5) is an arithmetic triplet because both 10 - 7 == 3 and 7 - 4 == 3.*/
class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(int i=0;i<nums.length;i++) {
            if(set.contains(nums[i]-diff)&&(set.contains(nums[i]-2*diff))) {
                count++;
            }
            set.add(nums[i]);
        }
        return count;
    }
}