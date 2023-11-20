//K Items With the Maximum Sum
//TC:O(n), SC:O(1)
//Input: numOnes = 3, numZeros = 2, numNegOnes = 0, k = 2
//Output: 2
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int result = 0;
        while(k>0 && numOnes>0) {
            result++;
            k--;
            numOnes--;
        }
        while(k>0 && numZeros>0) {
            k--;
            numZeros--;
        }
        while(k>0 && numNegOnes>0) {
            result = result-1;
            k--;
            numNegOnes--;
        }
        return result;
    }
}