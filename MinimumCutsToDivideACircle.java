//Minimum cuts to divide a circle
//TC:O(1), SC:O(1)
/*Input: n = 4
Output: 2
Explanation: 
The above figure shows how cutting the circle twice through the middle divides it into 4 equal slices*/
class Solution {
    public int numberOfCuts(int n) {
        if(n==1) return 0;
        return n%2==0?n/2:n;
    }
}