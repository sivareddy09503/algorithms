//Ugly number
//TC:O(n), SC:O(1)
//Input: n = 6
//Output: true
//Explanation: 6 = 2 × 3
class Solution {
    public boolean isUgly(int n) {
        if(n==1) return true;
        while(n>=5 && n%5==0)
            n /=5;
        while(n>=3 && n%3==0)
            n /=3;
        while(n>=2 && n%2==0)
            n /=2;
        return n==1;
    }
}