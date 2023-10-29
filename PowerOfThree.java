//Power of three
//TC:O(1), SC:O(1)
//Input: n = 27
//Output: true
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        while(n>1 && (n%3)==0)
            n /= 3;
        return (n==1 || n%3==0) ? true : false;
    }
}