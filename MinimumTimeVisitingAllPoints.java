//Minimum time visiting all points
//TC:O(n), SC:O(1)
/*Input: points = [[1,1],[3,4],[-1,0]]
Output: 7
Explanation: One optimal path is [1,1] -> [2,2] -> [3,3] -> [3,4] -> [2,3] -> [1,2] -> [0,1] -> [-1,0]   
Time from [1,1] to [3,4] = 3 seconds 
Time from [3,4] to [-1,0] = 4 seconds
Total time = 7 seconds*/
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;
        for(int i=0;i<points.length-1;i++) {
            result += Math.max(Math.abs(points[i][0]-points[i+1][0]), Math.abs(points[i+1][1]-points[i][1])) ;
        }
        return result;
    }
}