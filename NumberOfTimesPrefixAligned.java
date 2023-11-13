//Number of times binary string is prefix aligned
//TC:O(n), SC:O(1)
//Input: flips = [3,2,4,1,5]
//Output: 2
class Solution {
    public int numTimesAllBlue(int[] flips) {
        int i=1, expectedSum = 0, actualSum = 0, result = 0;
        for(int num:flips) {
            actualSum += num;
            expectedSum += i;
            if(actualSum == expectedSum) result++;
            i++;
        }
        return result;
    }
}