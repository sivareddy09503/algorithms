//Bitwise AND of numbers range
//TC:O(n).SC:O(1)
//Input: left = 5, right = 7
//Output: 4
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int result = right;
        while(right>left) {
            result = right & (right-1);
            right = result;
        }
        return result;
    }
}