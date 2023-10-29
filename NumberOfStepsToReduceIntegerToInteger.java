//Number of steps to reduce a number to zero
//TC:O(n), SC:O(1)
//Input: num = 14
//Output: 6
//In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
class Solution {
    public int numberOfSteps(int num) {
        int result = 0;
        while(num>0) {
            result++;
            if(num%2==0) {
                num = num/2;
            } else {
                num = num-1;
            }
        }
        return result;
    }
}