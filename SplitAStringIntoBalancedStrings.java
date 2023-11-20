//Split a string in balanced strings
//TC:O(n), SC:O(1)
/*Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.*/
class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int sum1=0, sum2=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='L') sum1++;
            if(s.charAt(i)=='R') sum2++;
            if(sum1==sum2) {
                count++;
                sum1=0;
                sum2=0;
            }
        }
        return count;
    }
}