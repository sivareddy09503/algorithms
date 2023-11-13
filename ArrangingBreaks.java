//Arranging coins
//TC:O(sqrt(n)),SC:O(1)
//Input: n = 5
//Output: 2
class Solution {
    public int arrangeCoins(int n) {
        int count = 1;
        while(n>0) {
            count++;
            n=n-count;
        }
        return count-1;
    }
}