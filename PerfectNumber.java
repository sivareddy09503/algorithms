//Perfect number
//TC:O(n), SC:O(1)
//Input: num = 28
//Output: true
class Solution {
    public boolean checkPerfectNumber(int num) {
        int result = 0;
        if(num%2!=0) return false;
        for(int i=1;i<=num/2;i++) {
            if(num%i==0) result += i;
        }
        return result==num;
    }
}