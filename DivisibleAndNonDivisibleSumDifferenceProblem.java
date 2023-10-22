//Divisible and Non-divisible Sums Difference
//TC:O(n), SC:O(1)
//Input: n = 10, m = 3
//Output: 19
class Solution {
    public int differenceOfSums(int n, int m) {
        int nondivSum = 0, divSum = 0;
        for(int i=1;i<=n;i++) {
            if(i%m==0) divSum +=i;
            else nondivSum += i;
        }
        return nondivSum-divSum;
    }
}