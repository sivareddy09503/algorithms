//Maximum enemy forts that can be captured
//TC:O(n), SC:O(1)
/*Input: forts = [1,0,0,-1,0,0,0,0,1]
Output: 4
Explanation:
- Moving the army from position 0 to position 3 captures 2 enemy forts, at 1 and 2.
- Moving the army from position 8 to position 3 captures 4 enemy forts.
Since 4 is the maximum number of enemy forts that can be captured, we return 4.*/
class Solution {
    public int captureForts(int[] forts) {
        int ans = 0;
        for(int i=0, j = 0;i<forts.length;i++) {
            if(forts[i]!=0) {
                if(forts[j] == -forts[i]) {
                    ans = Math.max(ans, i-j-1);
                }
                j = i;
            }
        }
        return ans;
    }
}