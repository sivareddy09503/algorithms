//determine-whether-matrix-can-be-obtained-by-rotation
//TC:O(n^2), SC:O(n)
/*Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.*/
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        if(mat==target) return true;
        int n = mat.length;
        int[][] res = new int[n][n];
        //Rotate 90 degrees clockwise
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                res[i][j]=mat[n-1-j][i];
            }
        }
         int[][] res1 = new int[n][n];
        //Rotate 180 degrees clockwise
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                res1[i][j]=res[n-1-j][i];
            }
        }
         int[][] res2 = new int[n][n];
        //Rotate 270 degrees clockwise
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                res2[i][j]=res1[n-1-j][i];
            }
        }
        if(Arrays.deepEquals(target,res)||Arrays.deepEquals(target,res1)||Arrays.deepEquals(target,res2) || Arrays.deepEquals(target,mat)) {
            return true;
        }
        return false;

    }
}