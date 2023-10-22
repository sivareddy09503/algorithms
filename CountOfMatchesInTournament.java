//Count of matches in tournament
//TC:O(n), SC:O(1)
//Input: n = 7
//Output: 6
//If n is even then A total of n / 2 matches are played, and n / 2 teams advance to the next round.
//If n is odd then A total of (n - 1) / 2 matches are played, and (n - 1) / 2 + 1 teams advance to the next round.
class Solution {
    public int numberOfMatches(int n) {
        int result = 0;
        while(n>1) {
            if(n%2 == 0) {
                result += n/2;
                n = n/2;  
            } else {
                result += (n-1)/2;
                n = ((n-1)/2) +1; 
            }
        }
        return result;
    }
}