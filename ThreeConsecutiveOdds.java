//three-consecutive-odds
//TC:O(n), SC:O(1)
/*Input: arr = [2,6,4,1]
Output: false
Explanation: There are no three consecutive odds.*/
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for(int num:arr) {
            if(num%2==0) {
                count = 0;
            } else {
                count++;
            }
            if(count==3) return true;
        }
        return false;
    }
}