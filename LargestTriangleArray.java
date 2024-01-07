//Largest Triangle Area
//TC:O(n^3), SC:O(1)
/*Input: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
Output: 2.00000
Explanation: The five points are shown in the above figure. The red triangle is the largest*/
class Solution {
    public double largestTriangleArea(int[][] points) {
        double ans = 0;
        for(int i=0;i<points.length;i++) {
            for(int j=i+1;j<points.length;j++) {
                for(int k=j+1;k<points.length;k++) {
                    ans = Math.max(ans, helper(points[i],points[j], points[k]));
                }
            }
        }
        return ans;
    }
    public double helper(int[] arr1, int[] arr2, int[] arr3) {
        double x1 = (double)arr1[0];
        double y1 = (double)arr1[1];

        double x2 = (double)arr2[0];
        double y2 = (double)arr2[1];

        double x3 = (double)arr3[0];
        double y3 = (double)arr3[1];

        return Math.abs(x1 * (y2-y3) + x2 * (y3-y1) + x3*(y1-y2))/2;
    }
}