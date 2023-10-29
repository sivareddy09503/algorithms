//Count Integers With even digit sum
//TC:O(nlogn), SC:O(1)
//Input: num = 30
//Output: 14
class Solution {
    public int countEven(int num) {
        int count = 0;
        for(int i=1;i<=num;i++) {
            if(checkSumEven(i)) count++;
        }
        return count;
    }
    public boolean checkSumEven(int n) {
        int evenSum = 0;
        while(n>0) {
            int rem = n%10;
            evenSum += rem;
            n = n/10;
        }
        return evenSum%2==0;
    }
}