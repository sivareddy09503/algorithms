//widest-vertical-area-between-two-points-containing-no-points
//TC:O(n),SC:O(1)
/*Input: points = [[8,7],[9,9],[7,4],[9,7]]
Output: 1
Explanation: Both the red and the blue area are optimal.*/
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
        int max_width=0;
        for(int i=1;i<points.length;i++) {
            int width = points[i][0]-points[i-1][0];
            max_width = Math.max(max_width,width);
        }
        return max_width;
    }
}