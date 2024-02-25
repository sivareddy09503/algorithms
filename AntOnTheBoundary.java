//Ant on the boundary
//TC:O(n), SC:O(1)
/*Input: nums = [2,3,-5]
Output: 1
Explanation: After the first step, the ant is 2 steps to the right of the boundary.
After the second step, the ant is 5 steps to the right of the boundary.
After the third step, the ant is on the boundary.
So the answer is 1.*/
class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int count = 0, displacement = 0;
        for(int i:nums) {
            displacement +=i;
            if(displacement==0) count++; 
        }
        return count;
    }
}