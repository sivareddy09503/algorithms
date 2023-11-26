//2 keys keyboard
//TC:O(n), SC:O(1)
/*Input: n = 3
Output: 3
Explanation: Initially, we have one character 'A'.
In step 1, we use Copy All operation.
In step 2, we use Paste operation to get 'AA'.
In step 3, we use Paste operation to get 'AAA'.*/
class Solution {
    public int minSteps(int n) {
        if(n==1) return 0;
        int min=n;
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0) min = Math.min(min,minSteps(n/i)+i);
        return min;
    }
}