//Sum Multiples(3,5,7) problem
//TC:O(n), SC:O(1)
//Input: n = 7
//Output: 21
class Solution {
    public int sumOfMultiples(int n) {
        int result = 0;
        for(int i=1;i<=n;i++) {
            if(i%3 == 0 || i%5 == 0 || i%7 == 0) {
                result +=i;
            }
        }
        return result;
    }
}