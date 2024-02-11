//matrix-cells-in-distance-order
//TC:O(n^2),SC:O(n^2)
/*Input: rows = 1, cols = 2, rCenter = 0, cCenter = 0
Output: [[0,0],[0,1]]
Explanation: The distances from (0, 0) to other cells are: [0,1]*/
class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        PriorityQueue<Pair<Integer,int[]>> pq = new PriorityQueue<>(rows*cols,(a,b)->a.getKey()-b.getKey());
        int[][] ans = new int[rows*cols][];
        Integer dist;
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                dist = Math.abs(rCenter-i)+Math.abs(cCenter-j);
                pq.add(new Pair<Integer,int[]>(dist,new int[]{i,j}));
            }
        }
        int i=0;
        while(!pq.isEmpty()) {
            ans[i] = pq.poll().getValue();
            i++;
        }
        return ans;
    }
}