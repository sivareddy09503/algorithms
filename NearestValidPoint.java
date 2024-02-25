//find-nearest-point-that-has-the-same-x-or-y-coordinate
//TC:O(n), SC:O(1)
/*Input: x = 3, y = 4, points = [[1,2],[3,1],[2,4],[2,3],[4,4]]
Output: 2
Explanation: Of all the points, only [3,1], [2,4] and [4,4] are valid. Of the valid points, [2,4] and [4,4] have the smallest Manhattan distance from your current location, with a distance of 1. [2,4] has the smallest index, so return 2.*/
class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int ans = -1;
        int temp = 10001;
        for(int i=0;i<points.length;i++) {
            if((points[i][0]==x)|| (points[i][1]==y)) {
                int val = Math.abs(points[i][0]-x)+Math.abs(points[i][1]-y);
                if(val<temp) {
                    temp = val;
                    ans = i;
                }
            }
        }
        return ans;
    }
}