//Complement of Base 10 Integer
//TC:O(1), SC:O(1)
//Input: n = 5 ->101
//Output: 2 ->010
class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        int num = 0;
        while(num<n) {
            num = (num << 1) | 1;
        }
        return num & ~n;
    }
}