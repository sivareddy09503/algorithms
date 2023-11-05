//Find the pivot integer
//TC:O(n), SC:O(1)
//Input: n = 8
//Output: 6
//Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21
class Solution {
    public int pivotInteger(int n) {
        int totalSum = n*(n+1)/2;
        int leftSum = 0;
        for(int i=1;i<=n;i++) {
            leftSum += i;
            if(totalSum-leftSum+i==leftSum) return i;
        }
        return -1;
    }
}