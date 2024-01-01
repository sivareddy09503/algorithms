//Find Integer Replacement
//TC:O(n), SC:O(1)
/*Input: n = 8
Output: 3
Explanation: 8 -> 4 -> 2 -> 1*/
class Solution {
    public int integerReplacement(int n) {
        int count = 0;
        long n1 = (long) n;
        while(n1!=1) {
            if(n1%2==0) {
                n1=n1/2;
            } else {
                long left = (n1-1)/2;
                if(left==1 || left%2==0) {
                    n1 = n1-1;
                } else {
                    n1 = n1+1;
                }
            }
            count++;
        }
        return count;
    }
}