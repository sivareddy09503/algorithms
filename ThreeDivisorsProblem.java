//Three Divisors problem
//TC:O(n),SC:O(1)
//Input: n = 2
//Output: false
class Solution {
    public boolean isThree(int n) {
        int count = 0;
        for(int i=1;i<=n;i++) {
            if(n%i==0) count++;
        }
        if(count ==3) return true;
        return false;
    }
}