//Prime in Diagonal
//TC:O(nlogn), SC:O(1)
/*Input: nums = [[1,2,3],[5,6,7],[9,10,11]]
Output: 11
Explanation: The numbers 1, 3, 6, 9, and 11 are the only numbers present on at least one of the diagonals. Since 11 is the largest prime, we return 11*/
class Solution {
    public int diagonalPrime(int[][] nums) {
        int max = 0;
        for(int i=0;i<nums.length;i++) {
            if(isPrime(nums[i][i])) 
                max = Math.max(max,nums[i][i]);
            if(isPrime(nums[i][nums.length-i-1]))
                max = Math.max(max, nums[i][nums.length-i-1]);
        }
        return max;
    }
    public boolean isPrime(int d) {
        if(d<2) return false;
        for(int i=2;i<=Math.sqrt(d);i++) {
            if(d%i==0) return false;
        }
        return true;
    }
}