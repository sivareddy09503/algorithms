//A number after a double reversal
//TC:O(1), SC:O(1)
//Input: num = 526
//Output: true
class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0) return true;
        return num%10==0?false:true;
    }
}