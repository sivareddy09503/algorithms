//Binary gap
//TC:O(n), SC:O(1)
//Input: n = 22
//Output: 2
/*Explanation: 22 in binary is "10110".
The first adjacent pair of 1's is "10110" with a distance of 2.
The second adjacent pair of 1's is "10110" with a distance of 1.
The answer is the largest of these two distances, which is 2.
Note that "10110" is not a valid pair since there is a 1 separating the two 1's underlined.*/
class Solution {
    public int binaryGap(int n) {
        int count=0, max=0;
        while(n>0) {
            if((n&1)==1) {
                max = Math.max(count,max);
                count = 1;
            } else if(count>0){
                count++;
            }
            n >>= 1;
        }
        return max;
    }
}