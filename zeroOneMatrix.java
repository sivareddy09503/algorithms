//01 Matrix
//TC:O(mn), SC:O(mn)
//Input: mat = [[0,0,0],[0,1,0],[0,0,0]]
//Output: [[0,0,0],[0,1,0],[0,0,0]]
class Solution {
    class Pair {
        int row, col;
        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        Queue<Pair> queue = new LinkedList<>();
        for(int r=0;r<m;r++) {
            for(int c=0;c<n;c++) {
                if(mat[r][c]==0) {
                    queue.add(new Pair(r,c));
                } else {
                    mat[r][c] = -1;
                }
            }
        }
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!queue.isEmpty()) {
            Pair pair = queue.poll();
            int row = pair.row;
            int col = pair.col;
            for(int i=0;i<4;i++) {
                int x = row + directions[i][0];
                int y = col + directions[i][1];
                if(x>=0 && x<m && y>=0 && y<n && mat[x][y]==-1) {
                    mat[x][y] = 1+mat[row][col];
                    queue.add(new Pair(x,y));
                }
            }
        }
        return mat;
    }
}