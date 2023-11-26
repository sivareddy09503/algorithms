//Bit manipulation
//TC:O(1), SC:O(1)
//Input: num = 5
//Output: 2
class Solution {
    public int findComplement(int num) {
        return ~num & (Integer.highestOneBit(num)-1);
    }
}