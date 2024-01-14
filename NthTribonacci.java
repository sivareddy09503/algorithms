//nth tribonacci number
//TC:O(n), SC:O(1)
/*Input: n = 4
Output: 4
Explanation:
T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4*/
class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        int a=0,b=1,c=1,sum=0;
        for(int i=3;i<=n;i++) {
            sum = a+b+c;
            a=b;
            b=c;
            c=sum;
        }
        return c;
    }
}