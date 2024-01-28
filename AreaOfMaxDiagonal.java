//Maximum area of longest diagonal rectangle
//TC:O(n), SC:O(1)
/*Input: dimensions = [[9,3],[8,6]]
Output: 48
Explanation: 
For index = 0, length = 9 and width = 3. Diagonal length = sqrt(9 * 9 + 3 * 3) = sqrt(90) ≈ 9.487.
For index = 1, length = 8 and width = 6. Diagonal length = sqrt(8 * 8 + 6 * 6) = sqrt(100) = 10.
So, the rectangle at index 1 has a greater diagonal length therefore we return area = 8 * 6 = 48.*/
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int n = dimensions.length;
        int ans = 0;
        double d = 0;
        for(int i=0;i<n;i++) {
            double t = Math.sqrt(dimensions[i][0]*dimensions[i][0] + dimensions[i][1]*dimensions[i][1]);
            if(t>=d) {
                if(t==d) {
                    ans = Math.max(ans, dimensions[i][0]*dimensions[i][1]);
                }
                else {
                    ans = dimensions[i][0]*dimensions[i][1];
                }
                d = t;
            }
        }
        return ans;
    }
}