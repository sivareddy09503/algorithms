//Count Odd numbers in an interval range
//TC:(1),SC:O(1)
//Input: low = 3, high = 7
//Output: 3
class Solution {
    public int countOdds(int low, int high) {
        if(low%2!=0 && high%2!=0) {
            return (1 + ((high-low)/2));
        }
        else {
            return (high-low)%2!=0?((high-low)/2)+1:(high-low)/2;
        }
    }
}