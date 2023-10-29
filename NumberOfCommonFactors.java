//Number of Common Factors
//TC:O(n),SC:O(1)
//Input: a = 12, b = 6
//Output: 4
//Explanation: The common factors of 12 and 6 are 1, 2, 3, 6
class Solution {
    public int commonFactors(int a, int b) {
        int count = 0;
        int length = a>b ? b : a;
        for(int i=1;i<=length;i++) {
            if(a%i==0 && b%i ==0) count++;
        }
        return count;
    }
}